package k.bs.designpatternsp.pattern.interpreter.kt

class Interpreter {
    /**
     * Interprets [extension] and returns [expression] value
     */
    fun interpret(expression: Expression): Int = when (expression) {
        is Expression.Mul -> interpret(expression.left) * interpret(expression.right)
        is Expression.Add -> interpret(expression.left) + interpret(expression.right)
        is Expression.Constant -> expression.value
    }
}