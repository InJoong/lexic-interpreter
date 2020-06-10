package mx.itesm.compiladores;

import java.util.ArrayList;
import java.util.List;

public class LiteralList extends Node {
    public List<Literal> literalList = new ArrayList<Literal>();

    public LiteralList(List<Literal> literalList) {
        this.literalList = literalList;
    }
    public void gen(){
        //lietralList
    }
}
