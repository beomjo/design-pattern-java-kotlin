package k.bs.designpatternsp.factorymethod

import k.bs.designpatternsp.pattern.factorymethod.kt.Country
import k.bs.designpatternsp.pattern.factorymethod.kt.CurrencyFactory
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class FactoryMethodTest {

    @Test
    fun `FactoryMethod`() {
        val greeceCurrency = CurrencyFactory.currencyForCountry(Country.Greece("")).code
        println("Greece currency: $greeceCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountry(Country.USA).code
        println("USA currency: $usaCurrency")

        Assert.assertThat(greeceCurrency, CoreMatchers.equalTo("EUR"))
        Assert.assertThat(usaCurrency, CoreMatchers.equalTo("USD"))
    }
}