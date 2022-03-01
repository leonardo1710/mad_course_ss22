package at.ac.fhcampuswien

fun main(args: Array<String>) {
    println("Hello Kotlin")


    var greeting = "Hello"  // mutable variable
    val name = "Jane"    // immutable variable

    // name = "John"   // "val cannot be reassigned
    println("$greeting $name !!")

    // type inference in kotlin
    var myString: String = "myString"
    var myString2 = "myString"

    val myInt: Int = 12
    val myInt2 = 12
}