package k.bs.designpatternsp.structural.proxy

import k.bs.designpatternsp.structural.proxy.kt.NormalFile
import k.bs.designpatternsp.structural.proxy.kt.SecuredFile
import org.junit.Test

class ProtectionProxyTest {
    @Test
    fun `Protection Proxy`() {
        val securedFile = SecuredFile(NormalFile())

        with(securedFile) {
            read("readme.md")
            password = "secret"
            read("readme.md")
        }
    }
}