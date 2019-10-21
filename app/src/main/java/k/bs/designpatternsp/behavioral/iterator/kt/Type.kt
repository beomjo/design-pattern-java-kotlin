package k.bs.designpatternsp.behavioral.iterator.kt

typealias Fruit = String

operator fun Fruits.iterator(): Iterator<Fruit> = FruitsIterator(this)


