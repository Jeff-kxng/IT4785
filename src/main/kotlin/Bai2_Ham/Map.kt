package Bai2_Ham

// map() thực hiện cùng một phép biến đổi trên mọi mục và trả về danh sách.
fun main(){
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
}