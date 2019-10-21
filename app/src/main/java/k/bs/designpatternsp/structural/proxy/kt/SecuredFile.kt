package k.bs.designpatternsp.structural.proxy.kt

//Proxy:
class SecuredFile(private val normalFile: File) : File {
    var password: String = ""

    override fun read(name: String) {
        if (password == "secret") {
            println("Password is correct: $password")
            normalFile.read(name)
        } else {
            println("Incorrect password. Access denied!")
        }
    }
}