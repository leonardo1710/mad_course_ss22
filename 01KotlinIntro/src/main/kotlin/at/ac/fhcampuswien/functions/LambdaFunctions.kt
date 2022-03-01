package at.ac.fhcampuswien.functions

/**
 * Lambda expressions are function literals.
 * Function literals are functions that are not declared but are passed immediately as an expression.
 *
 * Syntax
 *  A lambda expression is always surrounded by curly braces.
 *
 *  Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.
 *
 *  The body goes after the ->
 *
 *  If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.
 */
fun main(){
    val addition = sumAsLambda(12, 10)
    println("lambda addition: $addition")

    // lambdas can be passed to other functions
    printCustomMessage("My message", printMessage)

    val list = listOf("hello", "bye")
    val result = checkIfContains(list, "bye")
    
    println(result)
}

// val lambdaName : Type = { parameterList -> codeBody }
val sumAsLambda: (Int, Int) -> Int = {a, b -> a + b}

val catAgeAsLambda: (Int) -> Int = { age -> age * 7}    // calculate cat age with a lambda function

val catAgeAsLambdaShort: (Int) -> Int = { it * 7 }      // parameter emitted with "it"

// lambda that does not return a value (void)
// val name: (String) -> Unit = { name -> println(name)}
val name: (String) -> Unit = { println("Hello my name is $it")} // shorter

val printMessage: (String) -> Unit = { println("This is a message: $it")}

fun printCustomMessage(message: String, funAsParam: (String) -> Unit) {
    funAsParam(message)
}

// return from lambda
val checkIfContains: (List<String>, String) -> Boolean = { list, key ->
    val contains = list.contains(key)
    contains
}


