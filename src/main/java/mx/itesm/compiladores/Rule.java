package mx.itesm.compiladores;

import com.mongodb.Function;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Aggregates;
import org.bson.Document;
import org.stringtemplate.v4.misc.Aggregate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rule extends Node {
    public Atom atom;
    public Atoms atoms;

    public Rule(Atom atom, Atoms atoms) {
        this.atom = atom;
        this.atoms = atoms;
    }

    @Override
    public void gen(){
        //Regla
        MongoCollection<Document> collection = Main.db.getCollection(atom.predicate.predicateString);

        List<String> variables = new ArrayList<>();
        for(VariableOrLiteral variable : atom.variableOrLiterals.variableOrLiterals){
            variables.add(variable.value);
        }

        List<MongoCollection<Document>> collections = new ArrayList<>();
        for(Atom atom: atoms.atoms){
            collections.add(Main.db.getCollection(atom.predicate.predicateString));
        }

        if(collections.size() == 1){
            List<Document> documents = new ArrayList<>();
            for(Document doc : collections.get(0).find()){
                documents.add(doc);
            }
            collection.deleteMany(new Document());
            collection.insertMany(documents);
        } else {
            List<Document> documentsA = new ArrayList<>();
            for(Document doc : collections.get(0).find()){
                documentsA.add(doc);
            }
            List<Document> documentsB = new ArrayList<>();
            for(Document doc : collections.get(1).find()){
                documentsB.add(doc);
            }

            for(Document docA : documentsA){
                for(Document docB : documentsB){
                    if(docA.getString("1").equals(docB.getString("0"))){
                        Document document = new Document();
                        document.append("0", docA.getString("0"));
                        document.append("1", docB.getString("1"));
                        if(collection.find(document).first() == null){
                            collection.insertOne(document);
                        }
                    }
                }
            }
        }

    }
}
