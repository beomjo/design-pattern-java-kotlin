package k.bs.designpatternsp.pattern.prototype.bike

class PrototypeService<T : Vehicle> {
    private val showcase = hashMapOf<String, T>()

    fun register(name: String, model: T) {
        showcase[name] = model
    }

    fun createClone(name: String): T? {
        return (showcase[name]?.createClone()) as T
    }
}