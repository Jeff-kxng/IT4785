package Bai3_Class_Object

object Calculator {
    fun add(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}
fun main(){
    println(Calculator.add(2,4))
}
// Đối tượng / singleton
// Đôi khi, bạn chỉ muốn một thức thể của lớp tồn tại
// Dùng từ khóa Object thay cho từ khóa class
// Được truy ccajp bằng NameOfObject.<function ỏ variable>