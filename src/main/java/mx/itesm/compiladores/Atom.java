package mx.itesm.compiladores;

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
