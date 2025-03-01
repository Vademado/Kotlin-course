package org.example.lesson_1_10

fun main() {
    val name = getName()
    val age = getAge()

//    println("$name $age")

//    printNameAndAge(name, age)

//    printNameAndAge(userName = name, userAge = age)

    printNameAndAge(userName = getName(), userAge = getAge())
}

//fun getName(): String? {
//    println("Введите имя:")
//    val name = readLine()
//    println(name)
//    return name
//}
//
//fun getAge(): Int? {
//    println("Введите возраст:")
//    val age = readLine()?.toInt()
//    println(age)
//    return age
//}

//fun getName(): String? {
//    println("Введите имя:")
//    return readLine()
//}
//
//fun getAge(): Int? {
//    println("Введите возраст:")
//    return readLine()?.toInt()
//}

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}

fun getName(): String? = readLine()

fun getAge(): Int? = readLine()?.toInt()