package k.bs.designpatternsp.pattern.chain_of_responsibility.kt.ex1

interface HeadersChain {
    fun addHeader(inputHeader: String): String
}