package Bai2_Ham

// Nếu hằng hàm chỉ có một tham số, bạn có thể loại bỏ phần khai báo và "->".
//Tham số sẽ được khai báo ngầm bằng tên it.
fun main() {
    val ints = listOf(1, 2, 3)

    // Using 'it' as an implicit parameter
    val filtered1 = ints.filter { it > 0 }

    // Using an explicit parameter 'n'
    val filtered2 = ints.filter { n: Int -> n > 0 }

    // Using inferred parameter type
    val filtered3 = ints.filter { n -> n > 0 }

    println("Filtered (using 'it' keyword): $filtered1")
    println("Filtered (using explicit parameter): $filtered2")
    println("Filtered (using inferred parameter type): $filtered3")
}
