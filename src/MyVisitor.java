import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends ExprBaseVisitor<Integer> {

    public static Map<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssign(ExprParser.AssignContext ctx) {
        try {
            String id = ctx.ID().getText();  // id is left-hand side of '='
            int value = visit(ctx.expr());   // compute value of expression on the right
            memory.put(id, value);
            if (value != -0) {
                System.out.println(id + " = " + value); // store both in memory
                return value;
            }
            //return value;
        } catch (NullPointerException e) {
            System.out.println("Error: negative zero");
        }
        return 0;
    }

    @Override
    public Integer visitAdd(ExprParser.AddContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.term());
        return Math.addExact(left,right);
    }

    @Override
    public Integer visitSub(ExprParser.SubContext ctx) {
        int left = visit(ctx.expr());
        int right = visit(ctx.term());
        return Math.subtractExact(left,right);
    }

    @Override
    public Integer visitTerm_(ExprParser.Term_Context ctx) {
        return visitChildren(ctx); }

    @Override
    public Integer visitFact_(ExprParser.Fact_Context ctx) { return visitChildren(ctx); }

    @Override
    public Integer visitMul(ExprParser.MulContext ctx) {
        Integer left = visit(ctx.term());
        Integer right = visit(ctx.fact());
        return Math.multiplyExact(left, right);
    }

    @Override
    public Integer visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }

    @Override public Integer visitUnaryNeg(ExprParser.UnaryNegContext ctx) throws NullPointerException {
        Integer right = visit(ctx.fact());
        if (-1 * right == - 0) return null; // if the value is 0, it becomes -0, which should be caught
        // according to the progect assignment.
        return (-1 * right);
    }

    @Override public Integer visitUnaryPos(ExprParser.UnaryPosContext ctx) {
        Integer right = visit(ctx.fact());
        return right;
    }


    @Override
    public Integer visitInt(ExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.Literal().getText());
    }

    @Override
    public Integer visitId(ExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0;
    }
}


