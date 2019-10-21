package k.bs.designpatternsp.behavoral.state.ex2

import k.bs.designpatternsp.behavioral.state.kt.ex2.VendingMachine
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StateTest {

    @Test
    @DisplayName("Given a vending machine. When proceed with the steps. Then handle the request in each step as per current vending machine state")
    fun givenVendingMachine_whenProceedWithSteps_thenHandleRequestInEachStepAsPerCurrentVendingMachineState() {
        // Given
        val vendingMachine = VendingMachine()

        // When
        vendingMachine.proceed() // execute show products step and set the next vending machine state
        vendingMachine.proceed() // execute select product step and set the next vending machine state
        vendingMachine.proceed() // execute deposit money step and set the next vending machine state
        val result =
            vendingMachine.proceed() // execute deliver product step and set the initial vending machine state


        // Then
        val expectedResult =
            listOf("Show Products", "Select Product", "Deposit Money", "Deliver Product")
        Assert.assertThat(result, CoreMatchers.equalTo(expectedResult))
    }
}