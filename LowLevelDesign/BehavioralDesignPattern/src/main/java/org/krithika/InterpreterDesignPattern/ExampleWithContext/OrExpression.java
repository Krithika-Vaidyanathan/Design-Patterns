package org.krithika.InterpreterDesignPattern.ExampleWithContext;

// Non-Terminal Expression for OR
//Represents logical rules like AND, OR, NOT
public class OrExpression implements Expression {
    private Expression left;
    private Expression right;

    public OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public boolean interpret(Context context) {
        return left.interpret(context) || right.interpret(context);
    }
}