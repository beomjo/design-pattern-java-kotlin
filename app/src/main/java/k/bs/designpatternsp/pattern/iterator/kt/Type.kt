package k.bs.designpatternsp.pattern.iterator.kt

typealias Fruit = String

operator fun Fruits.iterator(): Iterator<Fruit> = FruitsIterator(this)


