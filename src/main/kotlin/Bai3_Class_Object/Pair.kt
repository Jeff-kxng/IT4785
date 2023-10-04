package Bai3_Class_Object

// Define an infix function 'to' for creating Pair
infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)

fun main() {
    val bookAuth1 = "Harry Potter" to "J. K. Rowling"
    val bookAuth2 = "Harry Potter".to("J. K. Rowling")

    println("bookAuth1: $bookAuth1")
    println("bookAuth2: $bookAuth2")

    val map = mapOf(1 to "x", 2 to "y", 3 to "zz")
    println("map: $map")
}
// Biểu thể to đặc biệt của pair cho phép loại bỏ dấu ngoặc đơn và dấu chấm (hàm infix)
// Pair và Triple là các lớp dữ liệu được xác định trước giúp lưu trữ 2 hoặc 3 đoạn dữ liệu tương ứng
//● Truy cập vào các biến bằng .first, .second, .third tương ứng
//● Các lớp dữ liệu được đặt tên thường là lựa chọn tốt hơn (tên có ý nghĩa hơn cho trường hợp sử dụng của bạn)