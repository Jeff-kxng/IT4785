package Bai2_Ham

// Hàm Lamda là một biẻu thức giúp tạo hàm không có tên
fun main() {
    var dirtLevel = 20
    val waterFilter = { level: Int -> level / 2 }
    println(waterFilter(dirtLevel))
}
