package k.bs.designpatternsp.behavioral.chain_of_responsibility.kt.ex1

class BodyPayload(val body: String, var next: HeadersChain? = null) : HeadersChain {

    override fun addHeader(inputHeader: String): String =
        inputHeader + "$body"
            .let { next?.addHeader(it) ?: it }
}