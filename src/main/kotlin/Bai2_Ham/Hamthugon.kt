package Bai2_Ham

// Hàm thu gọn hoặc hàm một biểu thức giúp mã trở nên ngắn gọn và dễ đọc hơn
fun double(x : Int){
    x * 2
} // Phiên bản đầy đủ
fun main(args: Array<String>) {
    val number = 5
    val doubledNumber = double(number)
    println("Double of $number is $doubledNumber")
}