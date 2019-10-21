package k.bs.designpatternsp.behavioral.state.kt.ex1

class AuthorizationPresenter {

    private var state: AuthorizationState = AuthorizationState.Unauthorized

    val isAuthorized: Boolean
        get() = when (state) {
            is AuthorizationState.Authorized -> true
            is AuthorizationState.Unauthorized -> false
        }

    val userName: String
        get() {
            return when (val state = this.state) { //val enables smart casting of state
                is AuthorizationState.Authorized -> state.userName
                is AuthorizationState.Unauthorized -> "Unknown"
            }
        }

    fun loginUser(userName: String) {
        state = AuthorizationState.Authorized(userName)
    }

    fun logoutUser() {
        state = AuthorizationState.Unauthorized
    }

    override fun toString() = "User '$userName' is logged in: $isAuthorized"
}