package mx.itesm.compiladores;

public class Variable extends Node {
    public String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public void gen() {

    }
}
