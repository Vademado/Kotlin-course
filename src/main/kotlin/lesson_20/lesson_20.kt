package lesson_20

import java.util.Calendar

fun main() {

//    анонимные функции
//    лямбды

    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear: () -> Int = fun(): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear.invoke())
    println(getDaysToEndYear())

    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    println(convertEndDaysToMills(getDaysToEndYear()))

//    val printStringWithLambda: (Int) -> Unit
    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        String
        "print string with lambda $answer"
    }

//    printStringWithLambda = {
//        println("print string with lambda $it")
//    }

//    printStringWithLambda = { it: Int -> Unit
//        println("print string with lambda $it")
//    }

//    printStringWithLambda = { answer: Int -> Unit
//        println("print string with lambda $answer")
//    }

    printStringWithLambda(42);

//    короткая запись
//    { it: Int -> println("print string with lambda 2 $it") }(442)
//    { it: Int -> "print string with lambda 2 $it" }(442)
    println({ it: Int -> "print string with lambda 2 $it" }(442))

//    конвертация дней в миллисекунды
    val convertLambda = { endDays: Int ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())

}