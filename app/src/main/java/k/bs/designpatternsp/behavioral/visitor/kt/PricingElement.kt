package k.bs.designpatternsp.behavioral.visitor.kt

interface PricingElement {
    fun <R> accept(visitor: ReportVisitor<R>): R
}