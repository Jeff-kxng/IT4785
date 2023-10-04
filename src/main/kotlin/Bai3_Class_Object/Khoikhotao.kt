package Bai3_Class_Object

class Khoikhotao {
    class Square(val side: Int) {
        init {
            println("Perimeter of the square: ${side * 4}")
        }
    }

    init {
        val s = Square(10)
    }
}

fun main() {
    val khoikhotao = Khoikhotao()
}
// Dùng từ khóa init: