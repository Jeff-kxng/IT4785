package Bai2_Ham

// Hàm bậc cao hơn nhận các hàm ở dạng tham số hoặc trả về một hàm
fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}

fun main() {
    val originalMsg = "Hello, World!"

    // Define an encoding lambda that reverses the message
    val reverseEncoder: (String) -> String = { str ->
        str.reversed()
    }

    // Call encodeMsg with the original message and the reverseEncoder lambda
    val encodedMsg = encodeMsg(originalMsg, reverseEncoder)

    println("Original Message: $originalMsg")
    println("Encoded Message: $encodedMsg")
}
