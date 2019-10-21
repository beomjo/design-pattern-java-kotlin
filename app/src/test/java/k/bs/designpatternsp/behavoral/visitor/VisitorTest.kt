package k.bs.designpatternsp.behavoral.visitor

import k.bs.designpatternsp.behavioral.visitor.kt.*
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.jupiter.api.Test

class VisitorTest {

    @Test
    fun `Visitor`() {
        val projectAlpha = FixedPriceContract(costPerYear = 10000)
        val projectBeta = SupportContract(costPerMonth = 500)
        val projectGamma = TimeAndMaterialsContract(hours = 150, costPerHour = 10)
        val projectKappa = TimeAndMaterialsContract(hours = 50, costPerHour = 50)

        val projects = arrayOf(projectAlpha, projectBeta, projectGamma, projectKappa)

        val monthlyCostReportVisitor = MonthlyCostReportVisitor()

        val monthlyCost = projects.map { it.accept(monthlyCostReportVisitor) }.sum()
        println("Monthly cost: $monthlyCost")

        Assert.assertThat(monthlyCost, CoreMatchers.`is`(5333L))

        val yearlyReportVisitor = YearlyReportVisitor()
        val yearlyCost = projects.map { it.accept(yearlyReportVisitor) }.sum()
        println("Yearly cost: $yearlyCost")

        Assert.assertThat(yearlyCost, CoreMatchers.`is`(20000L))
    }
}