package k.bs.designpatternsp.behavioral.iterator.kt

class FruitsIterator(container: Fruits) : Iterator<Fruit> {
    private val iterator = container.fruits.iterator()

    override fun hasNext(): Boolean = iterator.hasNext()
    override fun next(): Fruit = iterator.next()

}

