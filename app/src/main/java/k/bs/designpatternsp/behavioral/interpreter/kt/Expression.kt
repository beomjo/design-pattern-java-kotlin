package k.bs.designpatternsp.behavioral.interpreter.kt

sealed class Expression{
    class Constant(val value: Int) : Expression()
    class Mul(val left: Expression, val right: Expression) : Expression()
    class Add(val left: Expression, val right: Expression) : Expression()
}
