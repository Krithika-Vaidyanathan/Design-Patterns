package org.krithika.InterpreterDesignPattern.ExampleWithContext;

//Defines an interface for all expressions.
//Expression Interface – Just a rule with a method called interpret()
public interface Expression {
    boolean interpret(Context context);
}
