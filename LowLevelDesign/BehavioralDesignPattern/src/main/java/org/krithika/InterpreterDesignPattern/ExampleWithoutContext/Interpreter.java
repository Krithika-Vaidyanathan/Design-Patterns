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
public class Interpreter {
    private Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        // Parse expression and create expression tree
        Expression expressionTree = buildExpressionTree(expression);

        // Interpret expression tree
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        // Logic to parse expression and create expression tree
        // For simplicity, assume the expression is already parsed
        // and represented as an expression tree
        return new AdditionExpression(
                new NumberExpression(2),
                new MultiplicationExpression(
                        new NumberExpression(3),
                        new NumberExpression(4)
                )
        );
    }
}
