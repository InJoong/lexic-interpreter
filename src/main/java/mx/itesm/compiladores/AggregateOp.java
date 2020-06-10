package mx.itesm.compiladores;

public class AggregateOp extends Node {
    public String aggregateOp;

    public AggregateOp(String aggregateOp) {
        this.aggregateOp = aggregateOp;
    }

    @Override
    public void gen() {

    }
}
