package Bai2_Ham

// Các bộ lọc là eager theo mặc định. Một danh sách mới sẽ được tạo mỗi lần bạn
//dùng bộ lọc.
fun main(){
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter { it [0] == 'v' }
    println("eager: " + eager)
}