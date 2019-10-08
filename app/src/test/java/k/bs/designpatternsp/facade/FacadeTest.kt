package k.bs.designpatternsp.facade

import k.bs.designpatternsp.pattern.facade.movie.kt.User
import k.bs.designpatternsp.pattern.facade.movie.kt.UserRepository
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class FacadeTest {

    @Test
    fun Facade() {
        val userRepository = UserRepository()
        val user = User("bjso")
        userRepository.save(user)
        Assert.assertThat(user,CoreMatchers.`is`(userRepository.findFirst()))
    }
}