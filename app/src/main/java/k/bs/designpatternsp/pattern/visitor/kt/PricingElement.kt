package k.bs.designpatternsp.pattern.visitor.kt

interface PricingElement {
    fun <R> accept(visitor: ReportVisitor<R>): R
}