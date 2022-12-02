package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import kevin.parser.OperacionesLexer;
import kevin.parser.OperacionesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.*;
public class Controller {
    public TextArea textareachido;
    public TextArea areasalida;
    public Button btnchido;


    public void pressbutton(ActionEvent event) throws IOException {

        areasalida.clear();

        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wf;

        try {
            f = new File("data.txt");
             w = new FileWriter(f);
            w.write(textareachido.getText());
            w.close();
            bw= new BufferedWriter(w);
            wf = new PrintWriter(bw);

        }catch (Exception a){
            System.out.println("no jala tu chingadera ");
        }
        CharStream input = CharStreams.fromFileName("data.txt");
        OperacionesLexer lexico = new OperacionesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        OperacionesParser sintactico = new OperacionesParser(tokens);
        ParseTree arbol = sintactico.start();

        MyVisitor visitas =new MyVisitor();
        visitas.visit(arbol);
        areasalida.appendText(visitas.getResultado());
    }

    public void archivo(ActionEvent event)throws IOException{
        String aux = "";
        String texto = "";
        String resultado = "";
        try {
            JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
            file.showOpenDialog(null);
            File archivo = file.getSelectedFile();
            if (archivo != null) {
                FileReader archivos = new FileReader(archivo);
                BufferedReader leer = new BufferedReader(archivos);
                while ((aux = leer.readLine()) != null) {
                    texto += aux + "\n";
                }
                leer.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }
        textareachido.setText(texto);
    }
    public void borrar (ActionEvent event)throws IOException{
        areasalida.clear();
    }

    public void traductor(ActionEvent event)throws  IOException{
        FileWriter fw = new FileWriter("C:\\Users\\COOLER MASTER\\Desktop\\automatas2\\Calculadora\\data.txt");
        fw.write(textareachido.getText());
        fw.close();

        String texto = "";
        FileReader entrada = new FileReader("C:\\Users\\COOLER MASTER\\Desktop\\automatas2\\Calculadora\\data.txt");
        int c = 0;
        while(c != -1){
            c = entrada.read();
            char letra = (char)c;
            texto += letra;
        }
        entrada.close();
        String texto2 = texto.replaceAll("void", "galleta");
        String texto3 = texto2.replaceAll("\tint", "int");
        String texto4 = texto3.replaceAll("printf", "imprimir");
        String texto5 = texto4.replaceAll("if", "camara");
        String texto6 = texto5.replaceAll("else", "esquina");
        String texto7 = texto6.replaceAll("#include <stdio.h>"," ");
        String texto8 = texto7.replaceAll("while","mientras");
        String texto9 = texto8.replaceAll("float", "flotante");
        String texto10 = texto9.replaceAll("'(' ')'", "");
        textareachido.clear();
        texto10 = texto10.substring(0, texto10.length() -1);
        textareachido.appendText(texto10);
    }
    public void traductorc(ActionEvent event )throws  IOException{

        FileWriter fw = new FileWriter("C:\\Users\\COOLER MASTER\\Desktop\\automatas2\\Calculadora\\data.txt");
        fw.write(textareachido.getText());
        fw.close();

        String texto = "#include <stdio.h>";
        FileReader entrada = new FileReader("C:\\Users\\COOLER MASTER\\Desktop\\automatas2\\Calculadora\\data.txt");
        int c = 0;
        while(c != -1){
            c = entrada.read();
            char letra = (char)c;
            texto += letra;
        }
        entrada.close();
        String texto2 = texto.replaceAll("galleta", "void");
        String texto3 = texto2.replaceAll("int", "\tint");
        String texto4 = texto3.replaceAll("imprimir", "printf");
        String texto5 = texto4.replaceAll("camara", "if");
        String texto6 = texto5.replaceAll("esquina", "else");
        String texto7 = texto6.replaceAll("mientras","while");
        String texto8 = texto7.replaceAll("'(' ')'", "");
        textareachido.clear();
        texto8 = texto8.substring(0, texto8.length() -1);
        textareachido.appendText(texto8);
    }

}



