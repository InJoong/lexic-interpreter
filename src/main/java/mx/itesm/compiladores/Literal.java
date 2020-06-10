package mx.itesm.compiladores;

public class Literal extends Node {
    public String literal;

    public Literal(String literal) {
        this.literal = literal;
    }

    @Override
    public void gen() {

    }
}
