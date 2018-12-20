// Generated from C:/Javalib/Interpreter\Expr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prgm}.
	 * @param ctx the parse tree
	 */
	void enterPrgm(ExprParser.PrgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prgm}.
	 * @param ctx the parse tree
	 */
	void exitPrgm(ExprParser.PrgmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#asgmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#asgmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTerm_(ExprParser.Term_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code term_}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTerm_(ExprParser.Term_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(ExprParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(ExprParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMul(ExprParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMul(ExprParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fact_}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFact_(ExprParser.Fact_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fact_}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFact_(ExprParser.Fact_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterParens(ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitParens(ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNeg}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNeg(ExprParser.UnaryNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNeg}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNeg(ExprParser.UnaryNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPos}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPos(ExprParser.UnaryPosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPos}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPos(ExprParser.UnaryPosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterId(ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitId(ExprParser.IdContext ctx);
}