package Bai2_Ham

import javax.swing.JToolBar.Separator

// Các hàm có thể dùng kết hợp tham số mặc định và tham số bắt buộc
// normalizeCase: Boolean = true) có giá trị mặc định

// Define the reformat function with default parameter values
fun reformat(
    str: String,
    divideByCamelHumps: Boolean,
    wordSeparator: Char,
    normalizeCase: Boolean = true
) {
    // Function body here...
    println("String: $str")
    println("Divide by Camel Humps: $divideByCamelHumps")
    println("Word Separator: $wordSeparator")
    println("Normalize Case: $normalizeCase")
}

fun main(args: Array<String>) {
    // Call the reformat function with specific arguments
    reformat("Today is a day like no other day", false, '_')
}