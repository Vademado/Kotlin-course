package additional

fun main() {

//    class vs data class
//    equals() - сравнение двух объектов
//    hashCode() - уникальный код объекта
//    toString() - строковое представление
//    copy() - копирование объекта

    val word = Word("Red", "Красный")
    println(word)

    val word1 = Word("Red", "Красный")
    val word2 = Word("Red", "Красный")
    val word3 = Word("White", "Белый")
    println(word1 == word2)
    println(word2 == word3)

    println(word1 === word2)
    println(word2 === word3)

//    полное копирование
//    val word4 = word3.copy()

//    копирование с выборочным изменением полей
    val word4 = word3.copy(translate = "Правильный перевод: Белый")

    println(word3)
    println(word4)

    println(word1.hashCode())
    println(word2.hashCode())

}

//class Word(
//    val text: String,
//    val translate: String,
//) {
//    override fun toString(): String {
//        return "Word(text='$text', translate='$translate')"
//    }
//}

data class Word(
    val text: String,
    val translate: String,
)

//class Word(
//    val text: String,
//    val translate: String,
//)