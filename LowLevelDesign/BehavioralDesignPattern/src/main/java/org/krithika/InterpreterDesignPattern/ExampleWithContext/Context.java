package org.krithika.InterpreterDesignPattern.ExampleWithContext;

import java.util.Map;

//Context - Context holds the values of variables.
//A Context object is created and stores the variable map.
//Holds data or input needed during evaluation
public class Context {
    private Map<String, Boolean> variables;

    public Context(Map<String, Boolean> variables) {
        this.variables = variables;
    }

    public Boolean getValue(String name) {
        if(!variables.containsKey(name)) {
            throw new IllegalArgumentException("Variable not found: " + name);
        }
        return variables.get(name);
    }

}
