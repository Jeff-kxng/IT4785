package Bai2_Ham

// flatten() trả về một danh sách gồm tất cả các thành phần trong tập hợp
//lồng nhau.
fun main(){
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(numberSets.flatten())
}