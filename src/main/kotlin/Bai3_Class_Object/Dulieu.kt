package Bai3_Class_Object

// Define a data class Player
data class Player(val name: String, val score: Int)

fun main() {
    val firstPlayer = Player("Lauren", 10)
    println(firstPlayer)
}
// Lớp dữ liệu
// Lớp đặc biệt tồn tại chỉ để lưu trữ một tập dữ liệu
//● Đánh dấu lớp bằng từ khóa data
//● Tạo phương thức getter cho mỗi thuộc tính (và cả phương thức setter cho var)
//● Tạo phương thức toString(), equals(), hashCode(), copy() và toán tử phá hủy
//Định dạng: data class <NameOfClass>( parameterList )