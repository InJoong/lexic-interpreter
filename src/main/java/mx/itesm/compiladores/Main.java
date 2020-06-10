package mx.itesm.compiladores;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import org.bson.Document;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out;
    static MongoDatabase db;
    public static void main(String[] args) {

        MongoClientURI uri = new MongoClientURI(
                // cadena de conexión
                "mongodb+srv://admin:admin@cluster0-xzjed.mongodb.net/familia?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        db = mongoClient.getDatabase("familia");

        //  antlr
        try {
            out = new PrintWriter((args.length==0)?"salida.txt": args[0]);
            CharStream input = CharStreams.fromStream(System.in);
            DatalogLexer lexer = new DatalogLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DatalogParser parser = new DatalogParser(tokens);
            ParseTree tree = parser.program();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
            MyVisitor eval = new MyVisitor();
            Node n = (Node) eval.visit(tree);
            n.gen();

        }
        catch(Exception e) {
            System.out.println("Error V");
            e.printStackTrace();
        }

    }

}