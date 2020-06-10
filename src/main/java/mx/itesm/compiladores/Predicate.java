package mx.itesm.compiladores;

public class Predicate extends Node {
    public String predicateString;

    public Predicate(String predicateString) {
        this.predicateString = predicateString;
    }

    @Override
    public void gen() {

    }
}
