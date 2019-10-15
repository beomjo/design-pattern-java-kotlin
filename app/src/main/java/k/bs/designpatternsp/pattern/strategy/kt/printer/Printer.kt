package k.bs.designpatternsp.pattern.strategy.kt.printer

class Printer(private val stringFormatterStrategy: (String) -> String) {

    fun printString(string: String) {
        println(stringFormatterStrategy(string))
    }
}