package k.bs.designpatternsp

import k.bs.designpatternsp.pattern.builder.kt.MyDialog
import org.junit.Test

class TestGroundKt {

    @Test
    fun dialogTest() {
        val dialog=MyDialog.Builder("title")
            .setText("hello?")
            .setOnAccept { /**doSomethine*/ }
            .build()

        dialog.text
    }
}