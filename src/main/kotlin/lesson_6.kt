package org.example

fun main() {

//    while, do while

//    println("Реклама закончится через 5")
//    println("Реклама закончится через 4")
//    println("Реклама закончится через 3")
//    println("Реклама закончится через 2")
//    println("Реклама закончится через 1")

    var counter = 5

//    while (counter > 0) {
//        println("Реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    }

    do {
        println("Реклама закончится через ${counter--}")
        Thread.sleep(1000)
    } while (counter > 0)
}