package Bai3_Class_Object

class Person {
    val firstName: String
    val lastName: String

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    val fullName: String
        get() {
            return "$firstName $lastName"
        }
}

fun main() {
    val person = Person("John", "Doe")
    println(person.fullName)
}
