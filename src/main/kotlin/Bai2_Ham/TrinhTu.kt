package Bai2_Ham

// Trình tự có thể được chuyển lại thành danh sách bằng toList().

fun main() {
    val instruments = listOf("viola", "piano", "guitar", "violin")

    // Create a sequence and filter elements starting with 'v'
    val filtered = instruments.asSequence().filter { it[0] == 'v' }

    // Convert the filtered sequence back to a list using toList()
    val newList = filtered.toList()

    println("New List: $newList")
}
