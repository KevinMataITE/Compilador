package kevin.principal;

import kevin.parser.OperacionesLexer;
import kevin.parser.OperacionesParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.MyVisitor;

public class Principal   {





    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("data.txt");
        OperacionesLexer lexico = new OperacionesLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        OperacionesParser sintactico = new OperacionesParser(tokens);
        ParseTree arbol = sintactico.start();

        MyVisitor visitas =new MyVisitor();
        visitas.visit(arbol);

    }
}
