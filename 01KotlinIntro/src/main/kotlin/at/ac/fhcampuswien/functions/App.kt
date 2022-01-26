package at.ac.fhcampuswien.functions

/**
 * Showcases how you can write functions in kotlin
 */
fun main() {

    println("The sum of 1 and 3 is " + sum(1, 3))

    calculate(first = 1, multipleOf = 11)   // you can call functions with named arguments
    calculate(multipleOf = 12, first = 1)   // order does not matter in that case
    calculate(second = 20, first = 1, multipleOf = 4)

    println("cat age: " + calculateCatAge(4))

}

fun sum(number1: Int, number2: Int) : Int { // function with 2 parameters and return type
    return number1 + number2
}


fun calculate(first: Int, second: Int = 100, multipleOf: Int) {   // default value for argument
    for( i in first..second) {
        if( i%multipleOf == 0) {
            println("$i is multiple of $multipleOf")
        }
    }
}

fun calculateCatAge(age: Int): Int = age * 7    // functions can be one-liners

