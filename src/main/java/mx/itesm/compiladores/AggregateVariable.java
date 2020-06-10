package mx.itesm.compiladores;

public class AggregateVariable extends Node {
    AggregateOp aggregateOp;
    Variable variable;

    public AggregateVariable(AggregateOp aggregateOp, Variable variable) {
        this.aggregateOp = aggregateOp;
        this.variable = variable;
    }

    @Override
    public void gen() {

    }
}
