package Bai2_Ham
// Dùng args [0] để truy cập vào đối số đầu vòa đầu tiên được chuyển cho hmf main()
fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println("Hello, ${args[0]}")
    } else {
        println("Hello, World!") // Default message if no argument is provided
    }
}
