package at.ac.fhcampuswien.collections

fun main() {
    val myListOfNames = listOf("James", "Jane", "Paul", "Michael")

    /** looping lists **/
    myListOfNames.forEach {
        println(it)
    }

    myListOfNames.forEach { name ->
        println(name)
    }

    for(item in myListOfNames){
        println(item)
    }

    val myMutableListOfNumbers = mutableListOf(1, 2, 3, 4, 5)
    myMutableListOfNumbers.add(6)   // add at the end
    myMutableListOfNumbers.removeAt(0)  // remove at index
    myMutableListOfNumbers.remove(2)  // remove specific element

    println(myMutableListOfNumbers)

    println("List length = ${myMutableListOfNumbers.size}")


    val filteredList = myListOfNames.filter {
        it == "Paul"
    }

    println(filteredList)

    val filteredList2 = myListOfNames.filter {
        it.endsWith("l") && it.startsWith("P")
    }
}