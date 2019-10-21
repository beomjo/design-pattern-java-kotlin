package k.bs.designpatternsp.structural.proxy.kt

class NormalFile : File {
    override fun read(name: String) = println("Reading file: $name")
}