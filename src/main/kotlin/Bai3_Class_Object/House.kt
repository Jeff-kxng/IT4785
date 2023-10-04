package Bai3_Class_Object

// Tạo thực thể đối tượng mới
// Val myHouse = House ()
// println(myHouse)
class House(
    val color: String = "white",
    val numberOfWindows: Int = 2,
    val isForSale: Boolean = false
) {
    fun updateColor(newColor: String) {
        // Add code here to update the color of the house
    }
}

fun main() {
    // Create an instance of the House class
    val myHouse = House()

    // Access and print its properties
    println("Color: ${myHouse.color}")
    println("Number of Windows: ${myHouse.numberOfWindows}")
    println("Is For Sale: ${myHouse.isForSale}")

    // Update the color of the house
    myHouse.updateColor("blue")

    // Print the updated color
    println("Updated Color: ${myHouse.color}")
}
