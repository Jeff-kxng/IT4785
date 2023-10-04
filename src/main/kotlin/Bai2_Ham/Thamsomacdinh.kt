package Bai2_Ham

// Tham số mặc định
// Dùng "=" tiếp sau loại để xác định các giá trị mặc định
fun drive(speed: String = "Fast") {
    println("driving $speed")
}

fun main(args: Array<String>) {
    // Call the drive function without specifying the speed parameter
    drive() // This will use the default value "Fast"

    // Call the drive function with a specific speed
    drive("Slow")
}
