package mx.itesm.compiladores;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Atom extends Node {
    public Predicate predicate;
    public VariableOrLiterals variableOrLiterals;

    public Atom(Predicate predicate, VariableOrLiterals variableOrLiterals) {
        this.predicate = predicate;
        this.variableOrLiterals = variableOrLiterals;
    }

    @Override
    public void gen() {

    }
}
