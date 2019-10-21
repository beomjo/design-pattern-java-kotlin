package k.bs.designpatternsp.behavioral.chain_of_responsibility.kt.ex2

data class CashRequest(val amount: Int, val notes: List<Pair<Int, Int>> = listOf())