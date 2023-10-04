package Bai3_Class_Object

class HamDungChinh {
    // First version of the Circle class with an init block
    class Circle1(i: Int) {
        init {
            println("Circle1 created with radius $i")
            // Add your initialization code here
        }
    }

    // Second version of the Circle class with a constructor
    class Circle2(val radius: Int) {
        constructor(i: Int, j: Int) : this(i + j) {
            println("Circle2 created with radius $radius")
            // Add your initialization code here
        }
    }
}

fun main() {
    // Create instances of Circle1
    val circle1a = HamDungChinh.Circle1(5)
    val circle1b = HamDungChinh.Circle1(10)

    // Create instances of Circle2
    val circle2a = HamDungChinh.Circle2(5)
    val circle2b = HamDungChinh.Circle2(10, 20)
}
// Khái báo hàm dựng chính trong tiều đề lớp