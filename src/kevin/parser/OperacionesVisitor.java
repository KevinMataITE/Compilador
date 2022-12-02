// Generated from Operaciones.g4 by ANTLR 4.8
package kevin.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OperacionesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OperacionesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code lenguaje}
	 * labeled alternative in {@link OperacionesParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenguaje(OperacionesParser.LenguajeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contenidoCuerpo}
	 * labeled alternative in {@link OperacionesParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenidoCuerpo(OperacionesParser.ContenidoCuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(OperacionesParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#cuerpo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo2(OperacionesParser.Cuerpo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#condicionSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionSi(OperacionesParser.CondicionSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#condicionSiNoSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionSiNoSi(OperacionesParser.CondicionSiNoSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#condicionSiNoHaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionSiNoHaz(OperacionesParser.CondicionSiNoHazContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link OperacionesParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(OperacionesParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link OperacionesParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(OperacionesParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vali}
	 * labeled alternative in {@link OperacionesParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVali(OperacionesParser.ValiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igual}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(OperacionesParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayor}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(OperacionesParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menor}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(OperacionesParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorIgual}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgual(OperacionesParser.MayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorIgual}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgual(OperacionesParser.MenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diferenteDe}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferenteDe(OperacionesParser.DiferenteDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(OperacionesParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link OperacionesParser#validacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(OperacionesParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionConValor}
	 * labeled alternative in {@link OperacionesParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionConValor(OperacionesParser.DeclaracionConValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link OperacionesParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(OperacionesParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracion}
	 * labeled alternative in {@link OperacionesParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(OperacionesParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionConValorFlotante}
	 * labeled alternative in {@link OperacionesParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionConValorFlotante(OperacionesParser.DeclaracionConValorFlotanteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionesFlotante}
	 * labeled alternative in {@link OperacionesParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesFlotante(OperacionesParser.DeclaracionesFlotanteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(OperacionesParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumRes}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(OperacionesParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numFlotante}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFlotante(OperacionesParser.NumFlotanteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(OperacionesParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(OperacionesParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MilDiv}
	 * labeled alternative in {@link OperacionesParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMilDiv(OperacionesParser.MilDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(OperacionesParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#imprimirExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirExpr(OperacionesParser.ImprimirExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#imprimirCadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirCadena(OperacionesParser.ImprimirCadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#imprimirVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirVariable(OperacionesParser.ImprimirVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OperacionesParser#imprimirNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirNum(OperacionesParser.ImprimirNumContext ctx);
}