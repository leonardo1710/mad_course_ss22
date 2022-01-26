package at.ac.fhcampuswien

// main function - equivalent to javas public static void main(String[] args)
fun main(){
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