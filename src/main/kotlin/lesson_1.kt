package org.example

fun main() {
    var numberOfOrders: Int = 42
    val welcomeMessage: String = "Welcome to Kotlin"

//    var - изменяемая переменная
//    val - неизменяемая переменная
//    const val - константа

    println(numberOfOrders)
    println(welcomeMessage)

//    целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 2147483647u // 32 bit

//    вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 876.3f // 32 bit

//    строковые
    val stringValue: String = "this is string"
    val charValue: Char = '1'
}