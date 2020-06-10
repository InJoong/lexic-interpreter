// Generated from C:/Users/injoo/IdeaProjects/compiladores_proyecto/src\Datalog.g4 by ANTLR 4.8
package mx.itesm.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatalogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatalogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code FactProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactProgram(DatalogParser.FactProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QueryProgram}
	 * labeled alternative in {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryProgram(DatalogParser.QueryProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicateFact}
	 * labeled alternative in {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateFact(DatalogParser.PredicateFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralLiteralList}
	 * labeled alternative in {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralLiteralList(DatalogParser.LiteralLiteralListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactFacts}
	 * labeled alternative in {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactFacts(DatalogParser.FactFactsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomRegla}
	 * labeled alternative in {@link DatalogParser#regla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomRegla(DatalogParser.AtomReglaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReglaRules}
	 * labeled alternative in {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReglaRules(DatalogParser.ReglaRulesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomQuery}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomQuery(DatalogParser.AtomQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicateAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateAtom(DatalogParser.PredicateAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotAtom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotAtom(DatalogParser.NotAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomAtoms}
	 * labeled alternative in {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomAtoms(DatalogParser.AtomAtomsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableVariableOrLiteral(DatalogParser.VariableVariableOrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralVariableOrLiteral(DatalogParser.LiteralVariableOrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AVVariableOrLiteral}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAVVariableOrLiteral(DatalogParser.AVVariableOrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VLVariableOrLiterals}
	 * labeled alternative in {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVLVariableOrLiterals(DatalogParser.VLVariableOrLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AOAggregateVariable}
	 * labeled alternative in {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAOAggregateVariable(DatalogParser.AOAggregateVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CountAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountAggregateOp(DatalogParser.CountAggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AvgAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgAggregateOp(DatalogParser.AvgAggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumAggregateOp(DatalogParser.SumAggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinAggregateOp(DatalogParser.MinAggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxAggregateOp}
	 * labeled alternative in {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxAggregateOp(DatalogParser.MaxAggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariable(DatalogParser.IdentifierVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredicatePredicate}
	 * labeled alternative in {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicatePredicate(DatalogParser.PredicatePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(DatalogParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLLiteral(DatalogParser.FloatLLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(DatalogParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(DatalogParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(DatalogParser.StringLiteralContext ctx);
}