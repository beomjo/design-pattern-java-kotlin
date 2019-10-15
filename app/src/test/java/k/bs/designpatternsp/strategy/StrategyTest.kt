package k.bs.designpatternsp.strategy

import k.bs.designpatternsp.pattern.strategy.kt.printer.Printer
import org.junit.Test

class StrategyTest {

    val lowerCaseFormatter: (String) -> String = { it.toLowerCase() }
    val upperCaseFormatter = { it: String -> it.toUpperCase() }
    
    @Test
    fun Strategy() {

        val inputString = "LOREM ipsum DOLOR sit amet"

        val lowerCasePrinter =
            Printer(lowerCaseFormatter)
        lowerCasePrinter.printString(inputString)

        val upperCasePrinter =
            Printer(upperCaseFormatter)
        upperCasePrinter.printString(inputString)

        val prefixPrinter =
            Printer { "Prefix: $it" }
        prefixPrinter.printString(inputString)
    }
}