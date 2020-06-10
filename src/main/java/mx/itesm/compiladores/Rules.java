package mx.itesm.compiladores;

import java.util.ArrayList;
import java.util.List;

public class Rules extends Node {
    public List<Rule> rules = new ArrayList<Rule>();

    public Rules(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public void gen() {

    }
}
