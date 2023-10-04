package Bai3_Class_Object

interface Shape {
    fun computeArea(): Double
}

class Circle(val radius: Double) : Shape {
    override fun computeArea() = Math.PI * radius * radius
}

fun main() {
    val c = Circle(3.0)
    println(c.computeArea())
}
// Định dạng : interface NameOfTnterface { interfaceBody}