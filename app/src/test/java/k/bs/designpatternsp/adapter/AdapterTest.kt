package k.bs.designpatternsp.adapter

import k.bs.designpatternsp.pattern.adpater.kt.CelsiusTemperature
import k.bs.designpatternsp.pattern.adpater.kt.FahrenheitTemperature
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class AdapterTest {

    @Test
    fun Adapter() {
        val celsiusTemperature = CelsiusTemperature(0.0)
        val fahrenheitTemperature = FahrenheitTemperature(celsiusTemperature)

        celsiusTemperature.temperature = 36.6
        println("${celsiusTemperature.temperature} C -> ${fahrenheitTemperature.temperature} F")
        assertThat(fahrenheitTemperature.temperature, equalTo(97.88))

        fahrenheitTemperature.temperature = 100.0
        println("${fahrenheitTemperature.temperature} F -> ${celsiusTemperature.temperature} C")

        assertThat(celsiusTemperature.temperature, equalTo(37.78))
    }
}