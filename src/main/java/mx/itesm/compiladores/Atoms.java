package mx.itesm.compiladores;

import java.util.ArrayList;
import java.util.List;

public class Atoms extends Node {
    public List<Atom> atoms = new ArrayList<Atom>();

    public Atoms(List<Atom> atoms) {
        this.atoms = atoms;
    }

    @Override
    public void gen() {

    }
}
