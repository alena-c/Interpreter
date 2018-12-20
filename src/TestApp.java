import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Class TestApp creates a lexer, parser, and a token stream.
 *
 * */
public class TestApp {

    public static void main(String[] args) throws Exception {

        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;

        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);

        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.prgm();

        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
    }
}
