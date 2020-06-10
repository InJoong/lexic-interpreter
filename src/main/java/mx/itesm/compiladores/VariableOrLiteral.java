package mx.itesm.compiladores;

public class VariableOrLiteral extends Node {
    public String type;
    public String value;

    public VariableOrLiteral(String type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public void gen() {

    }
}
