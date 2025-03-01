package org.example.lesson_1_10

fun main() {
//    List
//    Set
//    Map

//    фикс размер у массива
//    Array<T>, List<T>
//    массивы оптимизированы для примитивов
//    отличается процесс сравнения элементов

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
    println(mutableList)

    mutableList.add(42)
    println(mutableList)

    mutableList.add(0, 42)
    println(mutableList)

    println(mutableList.contains(42))

    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())

    println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))

    mutableList.sort()
    mutableList.sortDescending()
    mutableList.reverse()
    println(mutableList)

//    mutableList.forEach {
//        println(it)
//    }

    mutableList.forEach { number ->
        println(number)
    }

//    интервал -> for
//    коллекция -> forEach
//    break, continue -> for

    val mutableList2 = mutableList.filter {
        it == 42
    }

    mutableList2.forEach { println(it) }

    val mutableList3 = mutableList2.map {
        it * 2
    }

    mutableList3.forEach { println(it) }
}