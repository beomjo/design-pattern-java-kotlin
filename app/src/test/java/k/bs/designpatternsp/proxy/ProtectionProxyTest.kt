package k.bs.designpatternsp.proxy

import k.bs.designpatternsp.pattern.proxy.kt.NormalFile
import k.bs.designpatternsp.pattern.proxy.kt.SecuredFile
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