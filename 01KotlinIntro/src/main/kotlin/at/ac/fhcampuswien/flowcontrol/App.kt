package at.ac.fhcampuswien.flowcontrol

fun main() {
    showCaseIfElse()
    showCaseWhenStatement()
    showCaseForLoop()
}

fun showCaseForLoop(){
    for(i in 1..3) {
        println(i)
    }

    val myList = listOf("banana", "grapes", "apple")

    for(item in myList) {
        println(item)
    }

    val myList2 = mutableListOf("banana", "grapes", "apple")
    myList2.add(3, "pear")

    for (item in myList2) {
        println(item)
    }

    var x = 10
    while( x > 0){
        x--
    }

    do {
        x++
    } while (x <= 10)

}

fun showCaseWhenStatement(){
    val amount = 100

    when (amount) {
        100 -> println("pretty much")
        150 -> println("wow..thats much")
        200 -> {
            println("multiline statements work too")
            println("just test it")
        }
        else -> println("$amount is not 100, 150 or 200")
    }

    when (amount) {
        in 1..100 -> println("ranges are done like this")
        !in 10..90 -> println("amount outside 10 - 90")
    }

    val validNumbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 100)

    when (amount) {
        in validNumbers -> println("$amount is a valid number")
    }

    val test = "prefix"
    val test2 = 10

    println("hasPrefix ${hasPrefix(test, "pre")}")
    println("hasPrefix ${hasPrefix(test2, "pre")}")
}

fun hasPrefix(x: Any, prefix: String) = when(x) {
    is String -> x.startsWith(prefix)
    else -> false
}

fun showCaseIfElse() {
    val amount = 100

    if(amount == 100){
        println("pretty much")
    } else if(amount > 100){
        println("wow..very much")
    } else {
        println("doing ok")
    }

    val a = 10;
    val b = 1;

    // block statements in if/else
    // last expression is the value of the block
    val max = if ( a > b) {
        a
    } else {
        b
    }
}
