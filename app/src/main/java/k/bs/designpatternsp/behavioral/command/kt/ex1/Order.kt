package k.bs.designpatternsp.behavioral.command.kt.ex1

typealias Order = () -> String

fun cookStarter(name: String): Order = { "$name Starter" }

fun cookMainCourse(name: String): Order = { "$name Main Course" }

fun cookDessert(name: String): Order = { "$name Dessert" }