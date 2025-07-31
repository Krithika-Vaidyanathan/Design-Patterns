package org.krithika.InterpreterDesignPattern.ExampleWithContext;

import java.util.HashMap;
import java.util.Map;

//Client directly chains them: A AND NOT B.
//The interpreter pattern helps you:
//    Break this sentence into parts.
//    Understand the meaning of each part.
//    Evaluate it and give the final result.
//👉 It’s like building a calculator for logic sentences.
//You use the Interpreter Pattern to create a small language (like logic or math), and you build small rule objects to interpret and evaluate it.

//main()
//└── rule.interpret(context)                         // AndExpression
//    ├── left.interpret(context)                    // VariableExpression("A")
//    │    └── context.getValue("A") → true
//    └── right.interpret(context)                   // NotExpression
//         └── innerExpression.interpret(context)    // VariableExpression("B")
//              └── context.getValue("B") → false
//         └── !false → true
//    └── true && true → true


public class InterpreterPatternClient {
    public static void main(String[] args) {
        //Set A=true, B=false
        Map<String, Boolean> variables = new HashMap<>();
        variables.put("A", true);
        variables.put("B", false);
        Context context = new Context(variables);

        //Expression: A AND NOT B(using chaining)
        Expression rule = new AndExpression(new VariableExpression("A"),
                new NotExpression(new VariableExpression("B")));

        boolean result = rule.interpret(context);
        System.out.println("Result of A AND NOT B: " + result); //Output:true
    }
}
