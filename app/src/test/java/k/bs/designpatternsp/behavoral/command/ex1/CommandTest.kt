package k.bs.designpatternsp.behavoral.command.ex1

import k.bs.designpatternsp.behavioral.command.kt.ex1.*
import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CommandTest {

    @Test
    @DisplayName("Given a set of dishes and a waiter. When order dishes. Then serve ordered dishes")
    fun givenSetOfDishesAndWaiter_whenOrderDishes_thenServeOrderedDishes() {
        // Given
        val starter: Order =
            cookStarter("Salad")
        val mainCourse: Order =
            cookMainCourse("Chicken")
        val dessert: Order =
            cookDessert("Fruit")
        val waiter = Waiter()

        // When
        waiter.acceptOrder(starter, mainCourse, dessert)
        val dishes = waiter.serveOrders()

        // Then
        val expectedDishes = listOf("Salad Starter", "Chicken Main Course", "Fruit Dessert")
        assertThat(dishes, CoreMatchers.equalTo(expectedDishes))
    }
}