package org.krithika.InterpreterDesignPattern.ExampleWithContext;

// Non-Terminal Expression for NOT
//Represents logical rules like AND, OR, NOT
public class NotExpression implements Expression {
    private Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    public boolean interpret(Context context) {
        return !expr.interpret(context);
    }
}
