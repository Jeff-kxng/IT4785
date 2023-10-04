package Bai3_Class_Object

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255)
}
fun main(){
    println("" + Color.RED.r + " " + Color.RED.g + " " + Color.RED.b)
}
// Lớp enum
// là loại dữ liệu do người dùng xác định cho một tập hợp các giá trị được đặt tên
// Dùng this để yẻu cầu các thực thể là một trong nhièu giá trị không đổi
// theo mặc định, sẽ không nình thầy giá trị không đổi
// Dùng enum phía trước từu khóa class
