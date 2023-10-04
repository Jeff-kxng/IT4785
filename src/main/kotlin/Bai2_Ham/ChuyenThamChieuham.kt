package Bai2_Ham

// Dùng toán tử :: để chuyển một hàm được đặt tên ở dạng đối số cho một hàm khác
fun enc2(input: String): String = input.reversed()

fun encodeMessage(input: String, encoder: (String) -> String): String {
    return encoder(input)
}

fun main() {
    val originalMessage = "abc"

    // Pass the enc2 function as a reference to the encodeMessage function
    val encodedMessage = encodeMessage(originalMessage, ::enc2)

    println("Original Message: $originalMessage")
    println("Encoded Message: $encodedMessage")
}
