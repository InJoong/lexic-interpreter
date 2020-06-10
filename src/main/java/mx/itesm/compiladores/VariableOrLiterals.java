package mx.itesm.compiladores;

import java.util.ArrayList;
import java.util.List;

public class VariableOrLiterals extends Node {
    public List<VariableOrLiteral> variableOrLiterals = new ArrayList<VariableOrLiteral>();

    public VariableOrLiterals(List<VariableOrLiteral> variableOrLiterals) {
        this.variableOrLiterals = variableOrLiterals;
    }

    @Override
    public void gen() {

    }
}
