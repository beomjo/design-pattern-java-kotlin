package k.bs.designpatternsp.behavoral.chain_of_responsibility.ex2

import k.bs.designpatternsp.behavioral.chain_of_responsibility.kt.ex2.CashRequest
import k.bs.designpatternsp.behavioral.chain_of_responsibility.kt.ex2.cashRequestHandlerChain
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ChainOfResponsibilityTest {

    @DisplayName("Given a cash request handler chain. When handle the amount. Then return a set of notes equivalent to the amount")
    @ParameterizedTest(name = "{0} = {1}")
    @MethodSource("amountProvider")
    fun givenCashRequestHandlerChain_whenHandleAmount_thenReturnSetOfNotesEquivalentToTheAmount(
        cashRequest: CashRequest,
        expectedResponse: CashRequest
    ) {
        // Given & When
        val response = cashRequestHandlerChain(cashRequest)

        // Then
        assertThat(response,CoreMatchers.equalTo(expectedResponse))
    }

    fun amountProvider(): Stream<Arguments> = Stream.of(
            Arguments.of(CashRequest(4), CashRequest(4, listOf<Pair<Int, Int>>())),
            Arguments.of(CashRequest(14), CashRequest(4, listOf(Pair(10, 1)))),
            Arguments.of(CashRequest(134), CashRequest(4, listOf(Pair(100, 1), Pair(20, 1), Pair(10, 1)))),
            Arguments.of(CashRequest(484), CashRequest(4, listOf(Pair(100, 4), Pair(50, 1), Pair(20, 1), Pair(10, 1))))
    )
}