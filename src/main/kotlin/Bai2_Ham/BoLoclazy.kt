package Bai2_Ham

// Trình tự là các cấu trúc dữ liệu dùng phương thức đánh giá lazy, và có thể được
//dùng với các bộ lọc để chuyển thành lazy.
fun main(){
    val instruments = listOf("viola", "cello", "violin")
    val filtered = instruments.asSequence().filter { it[0] == 'v'}
    println("filtered: " + filtered)

}