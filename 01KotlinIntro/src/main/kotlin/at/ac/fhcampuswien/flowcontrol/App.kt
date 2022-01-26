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
}