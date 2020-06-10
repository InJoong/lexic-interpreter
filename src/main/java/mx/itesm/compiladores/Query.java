package mx.itesm.compiladores;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class Query extends Node {
    public Atom atom;

    public Query(Atom atom) {
        this.atom = atom;
    }

    @Override
    public void gen(){
        //queries
        MongoCollection<Document> collection = Main.db.getCollection(atom.predicate.predicateString);

        Document document = new Document();

        for(int i=0; i<atom.variableOrLiterals.variableOrLiterals.size(); i++){
            VariableOrLiteral variableOrLiteral = atom.variableOrLiterals.variableOrLiterals.get(i);
            if(variableOrLiteral.type == "literal"){
                document.append(String.valueOf(i), variableOrLiteral.value);
            }
        }

        print(collection.find(document));
    }

    public void print(FindIterable<Document> finds){
        for(Document doc : finds){
                System.out.println(doc.toJson());
        }
    }
}
