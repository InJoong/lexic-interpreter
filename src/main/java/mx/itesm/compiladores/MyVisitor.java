package mx.itesm.compiladores;

import org.antlr.v4.runtime.RuleContext;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends DatalogBaseVisitor {
    @Override public Node visitFactProgram(DatalogParser.FactProgramContext ctx) { return (Facts) visit(ctx.facts()); }

    @Override
    public Node visitQueryProgram(DatalogParser.QueryProgramContext ctx) {
        Facts facts = null;
        Rules rules = null;

        if(ctx.facts() != null){
            facts = (Facts) visit(ctx.facts());
        }
        if(ctx.rules() != null){
            rules = (Rules) visit(ctx.rules());
        }

        Query query = (Query) visit(ctx.query());
        return new ProgramWrapper(facts, rules, query);
    }

    @Override
    public Node visitPredicateFact(DatalogParser.PredicateFactContext ctx) {
        Predicate predicate = (Predicate) visit(ctx.predicate());
        LiteralList lietralList = (LiteralList) visit(ctx.literalList());
        return new Fact(predicate, lietralList);
    }

    @Override
    public Node visitLiteralLiteralList(DatalogParser.LiteralLiteralListContext ctx) {
        List<Literal> literals = new ArrayList<>();

        for(DatalogParser.LiteralContext lit : ctx.literal()){
            Literal literal = (Literal) visit(lit);
            literals.add(literal);
        }

        return new LiteralList(literals);
    }

    @Override
    public Node visitFactFacts(DatalogParser.FactFactsContext ctx) {
        List<Fact> facts = new ArrayList<>();

        for(DatalogParser.FactContext f : ctx.fact()){
            Fact fact = (Fact) visit(f);
            facts.add(fact);
        }
        return new Facts(facts);
    }

    @Override
    public Node visitAtomRegla(DatalogParser.AtomReglaContext ctx) {
        Atom atom = (Atom) visit(ctx.atom());
        Atoms atoms = (Atoms) visit(ctx.atoms());
        return new Rule(atom, atoms);
    }

    @Override
    public Node visitReglaRules(DatalogParser.ReglaRulesContext ctx) {
        List<Rule> rules = new ArrayList<>();

        for(RuleContext r : ctx.regla()){
            Rule rule = (Rule) visit(r);
            rules.add(rule);
        }
        return new Rules(rules);
    }

    @Override
    public Node visitAtomQuery(DatalogParser.AtomQueryContext ctx) {
        Atom atom = (Atom) visit(ctx.atom());
        return new Query(atom);
    }

    @Override
    public Node visitPredicateAtom(DatalogParser.PredicateAtomContext ctx) {
        Predicate predicate = (Predicate) visit(ctx.predicate());
        VariableOrLiterals variableOrLiterals = (VariableOrLiterals) visit(ctx.variableOrLiterals());
        return new Atom(predicate, variableOrLiterals);
    }

    @Override
    public Node visitNotAtom(DatalogParser.NotAtomContext ctx) {
        //Checar esta parte
        Atom atom = (Atom) visit(ctx.atom());
        return atom;
    }

    @Override public Node visitAtomAtoms(DatalogParser.AtomAtomsContext ctx) {
        List<Atom> atoms = new ArrayList<>();

        for(DatalogParser.AtomContext at : ctx.atom()){
            Atom atom = (Atom) visit(at);
            atoms.add(atom);
        }

        return new Atoms(atoms);
    }

    @Override
    public Node visitVariableVariableOrLiteral(DatalogParser.VariableVariableOrLiteralContext ctx) {
        Variable variable = (Variable) visit(ctx.variable());
        return new VariableOrLiteral("variable", variable.variable);
    }

    @Override
    public Node visitLiteralVariableOrLiteral(DatalogParser.LiteralVariableOrLiteralContext ctx) {
        Literal literal = (Literal) visit(ctx.literal());
        return new VariableOrLiteral("literal", literal.literal);
    }

    @Override
    public Node visitAVVariableOrLiteral(DatalogParser.AVVariableOrLiteralContext ctx) {
        AggregateVariable aggregateVariable = (AggregateVariable) visit(ctx.aggregateVariable());
        String op = aggregateVariable.aggregateOp.aggregateOp;
        String variable = aggregateVariable.variable.variable;
        return new VariableOrLiteral( "aggregate", op + "<" + variable + ">");
    }

    @Override
    public Node visitVLVariableOrLiterals(DatalogParser.VLVariableOrLiteralsContext ctx) {
        List<VariableOrLiteral> variableOrLiterals = new ArrayList<>();

        for(DatalogParser.VariableOrLiteralContext vl : ctx.variableOrLiteral()){
            VariableOrLiteral variableOrLiteral = (VariableOrLiteral) visit(vl);
            variableOrLiterals.add(variableOrLiteral);
        }

        return new VariableOrLiterals(variableOrLiterals);
    }

    @Override
    public Node visitAOAggregateVariable(DatalogParser.AOAggregateVariableContext ctx) {
        AggregateOp op = (AggregateOp) visit(ctx.aggregateOp());
        Variable variable = (Variable) visit(ctx.variable());
        return new AggregateVariable(op, variable);
    }

    @Override
    public Node visitCountAggregateOp(DatalogParser.CountAggregateOpContext ctx) {
        return new AggregateOp(ctx.COUNT().getText());
    }

    @Override
    public Node visitAvgAggregateOp(DatalogParser.AvgAggregateOpContext ctx) {
        return new AggregateOp(ctx.AVG().getText());
    }

    @Override
    public Node visitSumAggregateOp(DatalogParser.SumAggregateOpContext ctx) {
        return new AggregateOp(ctx.SUM().getText());
    }

    @Override
    public Node visitMinAggregateOp(DatalogParser.MinAggregateOpContext ctx) {
        return new AggregateOp(ctx.MIN().getText());
    }

    @Override
    public Node visitMaxAggregateOp(DatalogParser.MaxAggregateOpContext ctx) {
        return new AggregateOp(ctx.MAX().getText());
    }

    @Override
    public Node visitIdentifierVariable(DatalogParser.IdentifierVariableContext ctx) {
        String variable = ctx.Identifier().getText();
        return new Variable(variable);
    }

    @Override
    public Node visitPredicatePredicate(DatalogParser.PredicatePredicateContext ctx) {
        return new Predicate(ctx.Predicate().getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Node visitIntegerLiteral(DatalogParser.IntegerLiteralContext ctx) {
        String literal = ctx.IntegerLiteral().getText();
        return new Literal(literal);
    }

    @Override
    public Node visitFloatLLiteral(DatalogParser.FloatLLiteralContext ctx) {
        String literal = ctx.FloatingPointLiteral().getText();
        return new Literal(literal);
    }

    @Override
    public Node visitBoolLiteral(DatalogParser.BoolLiteralContext ctx) {
        String literal = ctx.BOOLEANLITERAL().getText();
        return new Literal(literal);
    }

    @Override
    public Node visitCharLiteral(DatalogParser.CharLiteralContext ctx) {
        String literal = ctx.CharacterLiteral().getText();
        return new Literal(literal);
    }

    @Override
    public Node visitStringLiteral(DatalogParser.StringLiteralContext ctx) {
        String literal = ctx.StringLiteral().getText();
        return new Literal(literal);
    }
}
