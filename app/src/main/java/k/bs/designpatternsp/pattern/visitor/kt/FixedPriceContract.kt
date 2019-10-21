package k.bs.designpatternsp.pattern.visitor.kt

class FixedPriceContract(val costPerYear: Long) : PricingElement {
    override fun <R> accept(visitor: ReportVisitor<R>): R = visitor.visit(this)
}