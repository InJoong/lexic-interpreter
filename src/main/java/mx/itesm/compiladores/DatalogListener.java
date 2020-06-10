// Generated from C:/Users/injoo/IdeaProjects/compiladores_proyecto/src\Datalog.g4 by ANTLR 4.8
package mx.itesm.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code FactProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterFactProgram(DatalogParser.FactProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitFactProgram(DatalogParser.FactProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QueryProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterQueryProgram(DatalogParser.QueryProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QueryProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitQueryProgram(DatalogParser.QueryProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterDeleteProgram(DatalogParser.DeleteProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitDeleteProgram(DatalogParser.DeleteProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicateFact}
	 * labeled alternative in {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterPredicateFact(DatalogParser.PredicateFactContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicateFact}
	 * labeled alternative in {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitPredicateFact(DatalogParser.PredicateFactContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralLiteralList}
	 * labeled alternative in {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void enterLiteralLiteralList(DatalogParser.LiteralLiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralLiteralList}
	 * labeled alternative in {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void exitLiteralLiteralList(DatalogParser.LiteralLiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactFacts}
	 * labeled alternative in {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void enterFactFacts(DatalogParser.FactFactsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactFacts}
	 * labeled alternative in {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void exitFactFacts(DatalogParser.FactFactsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomRegla}
	 * labeled alternative in {@link DatalogParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterAtomRegla(DatalogParser.AtomReglaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomRegla}
	 * labeled alternative in {@link DatalogParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitAtomRegla(DatalogParser.AtomReglaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReglaRules}
	 * labeled alternative in {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterReglaRules(DatalogParser.ReglaRulesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReglaRules}
	 * labeled alternative in {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitReglaRules(DatalogParser.ReglaRulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomQuery}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterAtomQuery(DatalogParser.AtomQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomQuery}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitAtomQuery(DatalogParser.AtomQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicateAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPredicateAtom(DatalogParser.PredicateAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicateAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPredicateAtom(DatalogParser.PredicateAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNotAtom(DatalogParser.NotAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNotAtom(DatalogParser.NotAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomAtoms}
	 * labeled alternative in {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtomAtoms(DatalogParser.AtomAtomsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomAtoms}
	 * labeled alternative in {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtomAtoms(DatalogParser.AtomAtomsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVariableVariableOrLiteral(DatalogParser.VariableVariableOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVariableVariableOrLiteral(DatalogParser.VariableVariableOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLiteralVariableOrLiteral(DatalogParser.LiteralVariableOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLiteralVariableOrLiteral(DatalogParser.LiteralVariableOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AVVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAVVariableOrLiteral(DatalogParser.AVVariableOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AVVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAVVariableOrLiteral(DatalogParser.AVVariableOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VLVariableOrLiterals}
	 * labeled alternative in {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void enterVLVariableOrLiterals(DatalogParser.VLVariableOrLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VLVariableOrLiterals}
	 * labeled alternative in {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void exitVLVariableOrLiterals(DatalogParser.VLVariableOrLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AOAggregateVariable}
	 * labeled alternative in {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void enterAOAggregateVariable(DatalogParser.AOAggregateVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AOAggregateVariable}
	 * labeled alternative in {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void exitAOAggregateVariable(DatalogParser.AOAggregateVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CountAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterCountAggregateOp(DatalogParser.CountAggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CountAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitCountAggregateOp(DatalogParser.CountAggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AvgAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterAvgAggregateOp(DatalogParser.AvgAggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AvgAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitAvgAggregateOp(DatalogParser.AvgAggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterSumAggregateOp(DatalogParser.SumAggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitSumAggregateOp(DatalogParser.SumAggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterMinAggregateOp(DatalogParser.MinAggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitMinAggregateOp(DatalogParser.MinAggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaxAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterMaxAggregateOp(DatalogParser.MaxAggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaxAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitMaxAggregateOp(DatalogParser.MaxAggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierVariable(DatalogParser.IdentifierVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierVariable(DatalogParser.IdentifierVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredicatePredicate}
	 * labeled alternative in {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicatePredicate(DatalogParser.PredicatePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredicatePredicate}
	 * labeled alternative in {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicatePredicate(DatalogParser.PredicatePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(DatalogParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(DatalogParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatLLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLLiteral(DatalogParser.FloatLLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatLLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLLiteral(DatalogParser.FloatLLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(DatalogParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(DatalogParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(DatalogParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(DatalogParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(DatalogParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(DatalogParser.StringLiteralContext ctx);
}