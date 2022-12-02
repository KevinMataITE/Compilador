package sample;

import kevin.parser.ExceptionErrordedeclaracion;
import kevin.parser.OperacionesBaseVisitor;
import kevin.parser.OperacionesParser;
import com.sun.jdi.Value;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MyVisitor extends OperacionesBaseVisitor<Float>{

    Map<String,Float> memoria = new HashMap<String,Float>();
    Map<String,Float> memoriaFlotantes = new HashMap<String,Float>();
    Map<String,Float> memoriaTemp = new HashMap<String,Float>();
    Map<String,Float> memoriaFlotantesTemp = new HashMap<String,Float>();

    private String resultado;
    private int errores;
    private int contador;

    public MyVisitor() {
        resultado = "";
        errores = 0;
        contador = 0;
    }

    public void resetResultado(){
        resultado = "";
    }

    public String getResultado() {
        return resultado;
    }

    @Override public Float visitLenguaje(OperacionesParser.LenguajeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Float visitInt(OperacionesParser.IntContext ctx) {
        String ent = ctx.INT().getText() + "f";
        return Float.parseFloat(ent);
    }

    @Override public Float visitNumFlotante(OperacionesParser.NumFlotanteContext ctx) {
        return Float.parseFloat(ctx.NUM_FLOTANTE().getText());
    }

    @Override public Float visitId(OperacionesParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memoria.containsKey(id)){
            if(memoria.get(id) == null){
                if(errores <= 0){
                    String err = "\nHay un error de variable " + id + " no se ha inicializado en el codigo ";
                    resultado += err;
                    errores++;
                }
                return 0f;
            }
            return memoria.get(id);
        } else if(memoriaFlotantes.containsKey(id)){
            if(memoriaFlotantes.get(id) == null){
                if(errores <= 0){
                    String err = "\nHay un error de variable " + id + " no se ha inicializado en el codigo ";
                    resultado += err;
                    errores++;
                }
                return 0f;
            }
            return memoriaFlotantes.get(id);
        }
        else {
            if(errores == 0){
                String err = "\nHay un error de Variable " + id + " no se ha inicializado en el codigo ";
                resultado += err;
                errores++;
            }
        }
        return 0f;
    }

    @Override public Float visitMilDiv(OperacionesParser.MilDivContext ctx) {
        Float izq = visit(ctx.expr(0));
        Float der = visit(ctx.expr(1));

        if (ctx.op.getType() == OperacionesParser.DIV){
            if(der == 0){
                if(errores == 0){
                    resultado += "\nGrabe error No se puede dividir entre 0 ";
                    errores ++;
                    return 0f;
                }
                return 0f;
            }
            return izq / der;
        }
        return izq * der;
    }

    @Override public Float visitSumRes(OperacionesParser.SumResContext ctx) {
        Float izq = visit(ctx.expr(0));
        Float der = visit(ctx.expr(1));

        if (ctx.op.getType() == OperacionesParser.MAS){
            return izq + der;
        }
        return izq - der;
    }

    @Override public Float visitDeclaracionConValor(OperacionesParser.DeclaracionConValorContext ctx) {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id) || memoriaFlotantes.containsKey(id)){
            if(errores==0){
                String res = "\nError de  Variable '" + id + "' ya ha sido declarada en el codigo";
                resultado += res;
                errores++;
            }
        }
        else {
            Float valor = visit(ctx.expr());
            memoria.put(id,valor);
        }

        return 0f;
    }

    @Override public Float visitDeclaracionConValorFlotante(OperacionesParser.DeclaracionConValorFlotanteContext ctx) {
        String id = ctx.ID().getText();
        if(memoriaFlotantes.containsKey(id) || memoria.containsKey(id)){
            if(errores==0){
                String res = "\nError de  Variable '" + id + "' ya ha sido declarada en el codigo";
                resultado += res;
                errores++;
            }
        } else {
            Float valor = visit(ctx.expr());
            memoriaFlotantes.put(id,valor);
        }
        return 0f;
    }

    @Override public Float visitAsignacion(OperacionesParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        if(errores == 0){
            if(memoria.containsKey(id)){
                Float valor = visit(ctx.expr());
                memoria.put(id,valor);
                return valor;
            } else if(memoriaFlotantes.containsKey(id)){
                Float valor = visit(ctx.expr());
                memoriaFlotantes.put(id,valor);
                return valor;
            }
            else {
                if(errores == 0){
                    resultado += "\nErrore de variable " + id + "' no a sido declarada en el codigo";
                    errores++;
                }

            }
        }

        return -1f;
    }

    @Override public Float visitDeclaracion(OperacionesParser.DeclaracionContext ctx) {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id)){
            if(errores==0){
                String res = "\nError de  variable '" + id + "' ya ha sido declarada en el codigo ";
                resultado += res;
                errores++;
            }
        } else {
            memoria.put(id,null);
        }
        return visitChildren(ctx);
    }

    @Override public Float visitDeclaracionesFlotante(OperacionesParser.DeclaracionesFlotanteContext ctx) {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id) || memoriaFlotantes.containsKey(id)){
            if(errores==0){
                String res = "\nError de variable '" + id + "' ya ha sido declarada en el codigo ";
                System.out.println(res);
                resultado += res;
                errores++;
            }
        } else {
            memoriaFlotantes.put(id,null);
        }
        return visitChildren(ctx);
    }


    @Override public Float visitImprimirCadena(OperacionesParser.ImprimirCadenaContext ctx) {
        if(errores <= 0){
            String id = ctx.CADENA().getText();
            id = id.replaceAll("^\"|\"$","");
            System.out.println(id);
            resultado += "\n" + id;
            return visitChildren(ctx);
        }
        return 0f;
    }

    @Override public Float visitImprimirExpr(OperacionesParser.ImprimirExprContext ctx) {
        if(errores <= 0){
            Float expr1 = visit(ctx.expr());
            resultado += "\n" + expr1;
        }
        return visitChildren(ctx);
    }

    @Override public Float visitImprimirNum(OperacionesParser.ImprimirNumContext ctx) {
        if(errores <= 0){
            String id = ctx.INT().getText();
            System.out.println(id);
            resultado += "\n" + id;
            return visitChildren(ctx);
        }
        return 0f;
    }

    @Override public Float visitParentesis(OperacionesParser.ParentesisContext ctx) {
        return visit(ctx.expr());
    }

    @Override public Float visitAnd(OperacionesParser.AndContext ctx) {
        int i = 0;
        while(ctx.validacion(i) != null){
            if (visit(ctx.validacion(i)) == 0){
                return 0f;
            }
            i++;
        }
        return 1f;
    }

    @Override public Float visitOr(OperacionesParser.OrContext ctx) {
        int i = 0;
        while(ctx.validacion(i) != null){
            if (visit(ctx.validacion(i)) == 1){
                return 1f;
            }
            i++;
        }
        return 0f;
    }

    @Override public Float visitIgual(OperacionesParser.IgualContext ctx) {
        Float expr1 = visit(ctx.expr(0)).floatValue();
        Float expr2 = visit(ctx.expr(1)).floatValue();
        if(Math.abs(expr1 - expr2) < 0.00000001){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitMayor(OperacionesParser.MayorContext ctx) {
        Float expr1 = visit(ctx.expr(0));
        Float expr2 = visit(ctx.expr(1));

        if(expr1 > expr2){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitMenor(OperacionesParser.MenorContext ctx) {
        Float expr1 = visit(ctx.expr(0));
        Float expr2 = visit(ctx.expr(1));
        if(expr1 < expr2){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitMayorIgual(OperacionesParser.MayorIgualContext ctx) {
        Float expr1 = visit(ctx.expr(0));
        Float expr2 = visit(ctx.expr(1));

        if(expr1 >= expr2){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitMenorIgual(OperacionesParser.MenorIgualContext ctx) {
        Float expr1 = visit(ctx.expr(0));
        Float expr2 = visit(ctx.expr(1));

        if(expr1 <= expr2){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitDiferenteDe(OperacionesParser.DiferenteDeContext ctx) {
        Float expr1 = visit(ctx.expr(0));
        Float expr2 = visit(ctx.expr(1));

        if(Math.abs(expr1 - expr2) > 0.00000001){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitTrue(OperacionesParser.TrueContext ctx) {
        Float expr1 = visit(ctx.expr());

        if(expr1 == 1){
            return 1f;
        }
        return 0f;
    }

    @Override public Float visitCuerpo2(OperacionesParser.Cuerpo2Context ctx) {
        memoriaTemp = new HashMap<String,Float>(memoria);
        memoriaFlotantesTemp = new HashMap<String,Float>(memoriaFlotantes);
        visitChildren(ctx);
        return 0f;
    }

    @Override public Float visitContenidoCuerpo(OperacionesParser.ContenidoCuerpoContext ctx) {
        return visitChildren(ctx);
    }


    @Override public Float visitImprimirVariable(OperacionesParser.ImprimirVariableContext ctx) {
        String id = ctx.ID().getText();
        if(errores == 0){
            if(memoria.containsKey(id)){
                System.out.println("\n" + Math.round(memoria.get(id)));
                resultado += "\n" + Math.round(memoria.get(id));

            }
            else if(memoriaFlotantes.containsKey(id)){
                System.out.println("\n" + memoriaFlotantes.get(id));
                String res = "\n" + memoriaFlotantes.get(id);
                resultado += res;

            }
            else {
                System.out.println("\nError de variable " + id + "' no a sido declarada en el codigo ");
                resultado += "\n" + "Error de variable '" + id + "' no a sido declarada";
                errores++;
            }

        }

        return 0f;
    }

    @Override public Float visitCondicionSi(OperacionesParser.CondicionSiContext ctx) {
        // Comparacion será 1 si la condicion es verdadero y 0 si es falsa
        Float comparacion = visit(ctx.comparacion());
        // Situacion cuando lo que esta dentro del If es FALSO

        if(comparacion == 0f){
            if(ctx.condicionSiNoSi() == null && ctx.condicionSiNoHaz() != null){
                visit(ctx.condicionSiNoHaz());
                return 0f;
            }

            // Si contiene un ElseIf, visitalo
            if(ctx.condicionSiNoSi() != null){
                visit(ctx.condicionSiNoSi());
            }

            // Si no contiene nada despues del if, se sale
            return 0f;
        }

        // Cuando es verdadero el If, visita todo el contenido en cuerpo

        visit(ctx.cuerpo2());
        actualizarMapas();
        contador++;
        return 0f;
    }

    @Override public Float visitMientras(OperacionesParser.MientrasContext ctx) {
        Float validacion = visit(ctx.comparacion());
        while(validacion == 1f){
            visitChildren(ctx);
            validacion = visit(ctx.comparacion());
        }
        actualizarMapas();
        contador++;
        return 0f;
    }

    @Override public Float visitCondicionSiNoSi(OperacionesParser.CondicionSiNoSiContext ctx) {
        // Comparacion será 1 si la condicion es verdadero y 0 si es falsa
        Float comparacion = visit(ctx.comparacion());
        // Situacion cuando lo que esta dentro del If es FALSO
        if(comparacion == 0){
            // Si contiene Else-Ifs, visitalos
            if(ctx.condicionSiNoSi(0) != null){
                int i=0;
                while(ctx.condicionSiNoSi(i) != null){
                    visit(ctx.condicionSiNoSi(i));
                    i++;
                }
                return 0f;
            }
            // Si contiene un Else, visitalo
            if(ctx.condicionSiNoHaz() != null){
                visit(ctx.condicionSiNoHaz());
                return 0f;
            }
            // Si no tiene nada después, se sale
            return 0f;
        }
        // Cuando es verdadero el If, visita todo el contenido en cuerpo

        visit(ctx.cuerpo2());
        actualizarMapas();
        return 0f;
    }

    @Override public Float visitCondicionSiNoHaz(OperacionesParser.CondicionSiNoHazContext ctx) {
        visitChildren(ctx);
        actualizarMapas();
        return 0f;
    }

    @Override public Float visitNot(OperacionesParser.NotContext ctx) {
        Float comparacion = visit(ctx.validacion());
        if(comparacion == 0){
            return 1f;
        }

        return 0f;
    }

    @Override public Float visitVali(OperacionesParser.ValiContext ctx) {
        Float validacion = visit(ctx.validacion());
        if (validacion == 1){
            return 1f;
        }
        return 0f;
    }

    private void actualizarMapas(){
        Iterator<Map.Entry<String,Float>> memoriaIterator = memoria.entrySet().iterator();

        while(memoriaIterator.hasNext()){
            Map.Entry<String , Float> entry = memoriaIterator.next();
            if(!memoriaTemp.containsKey(entry.getKey())){
                memoria.remove(entry.getKey());
            }
        }
        memoria = new HashMap<String,Float>(memoriaTemp);
        memoriaTemp.clear();

        if(contador >= 6){
            memoriaFlotantes.remove("altura");
            memoriaFlotantes.remove("AF");
            memoriaFlotantes.remove("edad");
            memoriaFlotantes.remove("NEE");
        }
    }

    private void actualizarMapasFlotantes(){

    }

}
