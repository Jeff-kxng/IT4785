package Bai3_Class_Object

class Setter {
    var firstName: String = ""
    var lastName: String = ""

    var fullName: String
        get() = "$firstName $lastName"
        set(value) {
            val components = value.split(" ")
            firstName = components[0]
            lastName = components[1]
        }
}

fun main() {
    val person = Setter()
    person.fullName = "Jane Smith"

    println("First Name: ${person.firstName}")
    println("Last Name: ${person.lastName}")
    println("Full Name: ${person.fullName}")
}
