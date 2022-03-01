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

    System.out.println("Hello world!");
    println("Hello world")
}

fun nullables(){
    var a:String = "abc"
    // a = null // compilation error

    var b:String? = "abc"   // make b nullable
    //b = null

    println(b)

    println(a.length)   // non nullables can be used like this
    // println(b.length)   // compilation error: b can be null

    // safe calling nullables
    println(b?.length)  // will only be executed if b is not null

    // force unwrapping nullables -> try to avoid this!!
    val stringLength = println(b!!.length)

    // let keyword with safe call
    // let is one of Kotlin's Scope functions which allow you to execute a code block within the context of an object
    // can be used in combination with ? to do safe calls
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}