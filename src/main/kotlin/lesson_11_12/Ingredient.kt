package lesson_11_12

//class Ingredient(_name: String, _weight:Int, _count:Int) {
//
//    var name = _name
//    var weight = _weight
//    var count = _count
//
//}

class Ingredient(val name: String, val weight: Int, val count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
//        isNeedToPrepare: Boolean,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {
//        this.isNeedToPrepare = isNeedToPrepare
        isNeedToPrepare = _isNeedToPrepare
    }

    init {
        println("Ингредиент $name создан")
    }

//    вторичный конструктор
//    первичный конструктор
//    блоки init
//    тело вторичного конструктора

}