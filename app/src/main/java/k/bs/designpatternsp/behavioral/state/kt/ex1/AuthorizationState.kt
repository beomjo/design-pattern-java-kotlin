package k.bs.designpatternsp.behavioral.state.kt.ex1

sealed class AuthorizationState{
    object Unauthorized : AuthorizationState()
    class Authorized(val userName: String) : AuthorizationState()
}