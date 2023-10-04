package Bai3_Class_Object

// Define the isOdd extension function for Int
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun main() {
    val number = 3
    val isOdd = number.isOdd()
    println("Is $number odd? $isOdd")
}
// Thêm isOdd () vào lớp Int:
// isOdd() các hàm mở rộng rất hữu hiệu trong kotlin