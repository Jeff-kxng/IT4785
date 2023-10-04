package Bai3_Class_Object

class A
class B(val x: Int)
class C(val y: Int)

fun main() {
    val aa = A()
    val bb = B(12)
    println(bb.x) // This will print '12'

    val cc = C(42)
    println(cc.y) // This will print '42'
}
