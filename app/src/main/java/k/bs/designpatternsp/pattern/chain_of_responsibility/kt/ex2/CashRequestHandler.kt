package k.bs.designpatternsp.pattern.chain_of_responsibility.kt.ex2

typealias CashRequestHandler = (CashRequest) -> CashRequest

fun buildCashRequestHandlerForNote(note: Int): CashRequestHandler = { cashRequest ->
    if (cashRequest.amount > note) CashRequest(
            cashRequest.amount % note,
            cashRequest.notes + Pair(note, cashRequest.amount / note)
    )
    else cashRequest
}


val cashRequestHandlerChain: CashRequestHandler = listOf(100, 50, 20, 10, 5)
    .map(::buildCashRequestHandlerForNote)
    .reduce { chain, handler -> { cashRequest -> handler(chain(cashRequest)) } }