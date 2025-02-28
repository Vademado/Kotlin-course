package org.example

fun main() {

    val userAge = readln().toInt()

//    if (userAge >= AGE_OF_MAJORITY)
//        println("Show special content")
//    else if (userAge == 16 || userAge == 17)
//        println("Show limited content")
//    else
//        println("Back to main screen")

//    if (userAge >= AGE_OF_MAJORITY) println("Show special content")
//    else if (userAge == 16 || userAge == 17) println("Show limited content")
//    else println("Back to main screen")

    if (userAge >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else if (userAge == 16 || userAge == 17) {
        println("Show limited content")
    } else {
        println("Back to main screen")
    }

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (userAge == 16 || userAge == 17) {
        "Show limited content"
    } else {
        "Back to main screen"
    }
    println(resultText)


    when (userAge) {
        10 -> println("Your number is 10")
        20 -> println("Your number is 20")
        42 -> println("Your number is 42")
        else -> println("Another number")
    }

    val consoleNumber = when (userAge) {
        10 -> {
            println("Additional action")
            "Your number is 10"
        }

        20 -> "Your number is 20"
        42 -> "Your number is 42"
        else -> "Another number"
    }
    println(consoleNumber)

}

const val AGE_OF_MAJORITY = 18