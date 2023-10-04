package Bai2_Ham

// Điều kiện lọc trong dấu ngoặc nhọn {} sẽ kiểm tra từng mục khi bộ lọc lặp qua.
//Nếu biểu thức trả về true, mục sẽ được thêm vào.
fun main() {
    val books = listOf("nature", "biology", "birds")

    // Filter books that start with the letter 'b'
    val filteredBooks = books.filter { it[0] == 'b' }

    println("Filtered Books: $filteredBooks")
}
