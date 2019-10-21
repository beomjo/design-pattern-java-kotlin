package k.bs.designpatternsp.behavioral.strategy.kt.printer

class Printer(private val stringFormatterStrategy: (String) -> String) {

    fun printString(string: String) {
        println(stringFormatterStrategy(string))
    }
}