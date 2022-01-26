package at.ac.fhcampuswien.kotlinclasses

fun main(){
    val car = Car("red")
    car.drive()

    val car2 = Car("green", model = "Honda")

    println("Car color: ${car2.color}")

    car2.speed(10, 199)
}

class Car (val color: String, val model: String = "Fiat"){   // class with primary constructor
    // val color: String = "red"
    // val model: String = "Fiat"

    // init blocks are optional - they help with initialization
    init {
        if (color == "green") {
            println("i love green!")
        } else {
            println("not green")
        }
    }

    fun drive() {
        println("Drive...wroooom")
    }

    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min speed is $minSpeed and max speed is $maxSpeed")
    }
}