package mx.itesm.compiladores;

public class Fact extends  Node {
    public Predicate predicate;
    public LiteralList literalList;

    public Fact(Predicate predicate, LiteralList literalList) {
        this.predicate = predicate;
        this.literalList = literalList;
    }

    @Override
    public void gen(){
        //Se general el codigo de mongo

    }
}
