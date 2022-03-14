
fun main(){
    var gameOver = false
    val randomNumber = (0..9).shuffled().take(4).toList()

    print("Guess the 4 digit number")

    while (!gameOver){
        var samePos = 0
        val input = readLine()?.toList()

        input?.let {    // not null
            if ((input.size == 4) && input.all { it.isDigit() }) {  // is valid input
                val guess = input.map { it.digitToInt() }   // convert to List<int>

                val map = randomNumber.zip(guess)   // pair them lists
                val difference = guess.filter { !randomNumber.contains(it) }.size   // get count digits that differ

                if(difference == 0 && map.all { (x, y) -> x == y }) {   // check if contains all digits and at same pos
                    gameOver = true
                } else if(difference in 0..3){  // if there are some digits in both lists
                    map.forEach { pair ->
                        if(pair.first == pair.second) samePos++ // check which digits are at same position
                    }
                }

                println("${4-difference}:$samePos")
            } else {
                println("invalid guess")
            }
        }
    }

    println("You win!")
}

