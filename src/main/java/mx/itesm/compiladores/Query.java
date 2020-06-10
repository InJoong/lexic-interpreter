package mx.itesm.compiladores;

public class Query extends Node {
    public Atom atom;

    public Query(Atom atom) {
        this.atom = atom;
    }

    @Override
    public void gen(){
        //queries
    }
}
