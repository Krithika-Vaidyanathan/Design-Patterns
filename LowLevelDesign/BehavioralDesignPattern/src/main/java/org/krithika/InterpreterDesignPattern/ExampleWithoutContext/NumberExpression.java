package org.krithika.InterpreterDesignPattern.ExampleWithoutContext;

//Terminal Expression - This simply returns the value of a variable like "2" or "3".
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
