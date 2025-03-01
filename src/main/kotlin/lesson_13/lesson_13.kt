package lesson_13

fun main() {

//    NullPointerException (NPE)
//    null

    val nullableString: String? = null
    val nonNullableString: String = "some string"

    if (nullableString != null) println(nullableString.length)
    else println("Переменная хранит null")

    println(nullableString?.length)
    println(nonNullableString.length)

    var nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 0
//    println(stringLength)

    val stringLength: Int = nullableString!!.length
}