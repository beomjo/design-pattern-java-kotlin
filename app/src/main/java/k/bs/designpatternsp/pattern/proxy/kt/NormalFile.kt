package k.bs.designpatternsp.pattern.proxy.kt

class NormalFile : File {
    override fun read(name: String) = println("Reading file: $name")
}