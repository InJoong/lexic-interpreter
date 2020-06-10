package mx.itesm.compiladores;

import java.util.ArrayList;
import java.util.List;

public class Facts extends Node{
    public List<Fact> facts = new ArrayList<Fact>();

    public Facts(List<Fact> facts) {
        this.facts = facts;
    }

    @Override
    public void gen() {

    }
}
