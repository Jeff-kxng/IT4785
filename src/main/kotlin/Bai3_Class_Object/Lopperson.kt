import Bai3_Class_Object.Person

class Lopperson(var name: String)

fun main() {
    val person = Lopperson("Alex")
    println(person.name) // Access using .<property name>

    person.name = "Joey" // Set using .<property name>
    println(person.name)
}