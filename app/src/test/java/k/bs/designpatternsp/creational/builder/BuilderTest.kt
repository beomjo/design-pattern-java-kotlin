package k.bs.designpatternsp.creational.builder

import k.bs.designpatternsp.creational.builder.kt.MyDialog
import org.junit.Test

class BuilderTest {
    @Test
    fun buildDialog() {
        MyDialog.Builder("myDialog")
            .setText("this is contents")
            .setOnAccept {
                //doSomeThing
            }
            .build()
    }
}