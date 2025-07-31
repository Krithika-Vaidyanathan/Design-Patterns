package org.krithika.InterpreterDesignPattern.ExampleWithContext;

//Terminal Expression - This simply returns the value of a variable like "A" or "B" from the context.
//VariableExpression fetches A or B from the context. Represents leaf-level rules like "A", "B", etc.
public class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    public boolean interpret(Context context) {
        return context.getValue(name);
    }
}
