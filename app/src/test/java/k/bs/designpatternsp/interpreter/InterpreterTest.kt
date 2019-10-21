package k.bs.designpatternsp.interpreter

import k.bs.designpatternsp.pattern.interpreter.kt.Expression
import k.bs.designpatternsp.pattern.interpreter.kt.Interpreter
import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InterpreterTest {

    val interpreter = Interpreter()

    @ParameterizedTest(name = "{0} = {2}")
    @MethodSource("expressionProvider")
    fun givenExpressionAndInterpreter_whenInterpretExpression_thenReturnExpressionVaue(
        @Suppress("UNUSED_PARAMETER") expressionText: String,
        expression: Expression,
        expectedValue: Int
    ) {
        // Given & When
        val value = interpreter.interpret(expression)

        // Then
        assertThat(value,CoreMatchers.equalTo(expectedValue))
    }


    fun expressionProvider(): Stream<Arguments> = Stream.of(
            Arguments.of("1", Expression.Constant(1), 1),
            Arguments.of("1+2", Expression.Add(Expression.Constant(1), Expression.Constant(2)), 3),
            Arguments.of("1+2*3", Expression.Add(Expression.Constant(1),
                Expression.Mul(Expression.Constant(2), Expression.Constant(3))
            ), 7)
    )
}