package k.bs.designpatternsp.chain_of_responsibility.ex1

import k.bs.designpatternsp.pattern.chain_of_responsibility.kt.ex1.AuthenticationHeader
import k.bs.designpatternsp.pattern.chain_of_responsibility.kt.ex1.BodyPayload
import k.bs.designpatternsp.pattern.chain_of_responsibility.kt.ex1.ContentTypeHeader
import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.jupiter.api.Test

class ChainOfResponsibilityTest {

    @Test
    fun `Chain Of Responsibility`() {
        //create chain elements
        val authenticationHeader = AuthenticationHeader("123456")
        val contentTypeHeader = ContentTypeHeader("json")
        val messageBody = BodyPayload("Body:\n{\n\"username\"=\"dbacinski\"\n}")

        //construct chain
        authenticationHeader.next = contentTypeHeader
        contentTypeHeader.next = messageBody

        //execute chain
        val messageWithAuthentication =
            authenticationHeader.addHeader("Headers with Authentication:\n")

        println(messageWithAuthentication)

        println()
        println()

        val messageWithoutAuth =
            contentTypeHeader.addHeader("Headers:\n")
        println(messageWithoutAuth)

        assertThat(
            messageWithAuthentication, CoreMatchers.equalTo(
                """
                Headers with Authentication:
                Authorization: Bearer 123456
                ContentType: json
                Body:
                {
                "username"="dbacinski"
                }
            """.trimIndent()
            )
        )

        assertThat(
            messageWithoutAuth, CoreMatchers.equalTo(
                """
                Headers:
                ContentType: json
                Body:
                {
                "username"="dbacinski"
                }
            """.trimIndent()
            )
        )
    }
}