package k.bs.designpatternsp.state.ex1

import k.bs.designpatternsp.pattern.state.kt.ex1.AuthorizationPresenter
import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.jupiter.api.Test

class StateTest {

    @Test
    fun `State`() {
        val authorizationPresenter = AuthorizationPresenter()

        authorizationPresenter.loginUser("admin")
        println(authorizationPresenter)
        assertThat(authorizationPresenter.isAuthorized, CoreMatchers.equalTo(true))
        assertThat(authorizationPresenter.userName, CoreMatchers.equalTo("admin"))

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertThat(authorizationPresenter.isAuthorized, CoreMatchers.equalTo(false))
        assertThat(authorizationPresenter.userName, CoreMatchers.equalTo("Unknown"))
    }
}
