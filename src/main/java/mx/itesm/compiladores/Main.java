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
import java.util.*;

public class Main {
    public static void main(String[] args) {

        MongoClientURI uri = new MongoClientURI(
                // cadena de conexión
                "mongodb+srv://admin:admin@cluster0-xzjed.mongodb.net/familia?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase db = mongoClient.getDatabase("familia");
        MongoIterable<String> cols = db.listCollectionNames();
        for(String s : cols)
            System.out.println(s);
        MongoCollection<Document> res = db.getCollection("padre-hijo");
        FindIterable<Document> findIterable = res.find();
        for (Document d : findIterable)
            System.out.println(d);

        //  antlr
        try {
            //CharStream input = CharStreams.fromStream(System.in);
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
        }

    }

}