package org.krithika.InterpreterDesignPattern.ExampleWithContext;


//Non-Terminal Expression for AND
//Represents logical rules like AND, OR, NOT
public class AndExpression implements Expression {
    private Expression left;
    private Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) && right.interpret(context);
    }
}
