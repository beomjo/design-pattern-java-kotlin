package k.bs.designpatternsp.behavioral.visitor.kt

class TimeAndMaterialsContract(val costPerHour: Long, val hours: Long) : PricingElement {
    override fun <R> accept(visitor: ReportVisitor<R>): R = visitor.visit(this)
}