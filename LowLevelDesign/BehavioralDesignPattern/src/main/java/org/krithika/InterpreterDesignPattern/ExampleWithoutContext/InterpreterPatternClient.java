package org.krithika.InterpreterDesignPattern.ExampleWithoutContext;

//main()
//└── interpreter.interpret("2 + 3 * 4")
//    └── add.interpret()                    // AddExpression
//        ├── left.interpret()              // NumberExpression(2) → 2
//        └── right.interpret()             // MultiplyExpression
//             ├── left.interpret()         // NumberExpression(3) → 3
//             └── right.interpret()        // NumberExpression(4) → 4
//             └── 3 * 4 → 12
//        └── 2 + 12 → 14
public class InterpreterPatternClient {
    public static void main(String[] args) {
        // Input expression
        String expression = "2 + 3 * 4";

        // Create interpreter
        Context context = new Context();
        Interpreter interpreter = new Interpreter(context);

        // Interpret expression
        int result = interpreter.interpret(expression);
        System.out.println("Result: " + result);
    }
}
