package k.bs.designpatternsp.pattern.factorymethod.kt

object CurrencyFactory {

    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Country.Greece -> Currency("EUR")
            is Country.Spain -> Currency("EUR")
            is Country.USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
        }  //try to add a new country Poland, it won't even compile without adding new branch to 'when'
}