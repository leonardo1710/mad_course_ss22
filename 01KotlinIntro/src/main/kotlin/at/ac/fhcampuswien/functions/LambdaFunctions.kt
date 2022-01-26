package at.ac.fhcampuswien.functions

fun main(){
    val addition = sumAsLambda(12, 10)
    println("lambda addition: $addition")

    // lambdas can be passed to other functions
    printCustomMessage("My message", printMessage)
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


