package mx.itesm.compiladores;

public class Rule extends Node {
    public Atom atom;
    public Atoms atoms;

    public Rule(Atom atom, Atoms atoms) {
        this.atom = atom;
        this.atoms = atoms;
    }

    @Override
    public void gen(){
        //regla
    }
}
