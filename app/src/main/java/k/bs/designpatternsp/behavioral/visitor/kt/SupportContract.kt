package k.bs.designpatternsp.behavioral.visitor.kt

class SupportContract(val costPerMonth: Long) : PricingElement {
    override fun <R> accept(visitor: ReportVisitor<R>): R = visitor.visit(this)
}