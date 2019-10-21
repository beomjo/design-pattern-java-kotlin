package k.bs.designpatternsp.behavioral.visitor.kt

class FixedPriceContract(val costPerYear: Long) : PricingElement {
    override fun <R> accept(visitor: ReportVisitor<R>): R = visitor.visit(this)
}