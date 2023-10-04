package Bai3_Class_Object

class Thamsomacdinh {
    class Box(val length: Int, val width: Int = 20, val height: Int = 40)

    val box1 = Box(100, 20, 40)
    val box2 = Box(length = 100)
    val box3 = Box(length = 100, width = 20, height = 40)
}

fun main() {
    val thamsomacdinh = Thamsomacdinh()

    println("Box 1: length=${thamsomacdinh.box1.length}, width=${thamsomacdinh.box1.width}, height=${thamsomacdinh.box1.height}")
    println("Box 2: length=${thamsomacdinh.box2.length}, width=${thamsomacdinh.box2.width}, height=${thamsomacdinh.box2.height}")
    println("Box 3: length=${thamsomacdinh.box3.length}, width=${thamsomacdinh.box3.width}, height=${thamsomacdinh.box3.height}")
}
// thực thể lớp có thể chứa các giá trị mặc định
// Dùng các giá trị mặc địng để giảm số lượng hàm dựng cần có
// Có thể kết hợp tham số mặc định với tham số bắt buộc
// Ngắn ngọn hơn (không cần có nhiều phiên bản hàm dựng)