package lesson_18

import java.util.*

fun main() {

//    ad hoc (по случаю)
//    subtyping (полиморфизм включения)
//    parametric (параметрический)

    val creationDate = Date()
//    val note = NotesAppItem()
//
//    note.addItemToCell(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate"
//    )
//    println()
//
//    note.addItemToCell(
//        "sister's number",
//        creationDate,
//        "phone",
//        89914424242
//    )
//    println()
//
//    note.addItemToCell(
//        "todolist",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "buy new shoes")
//    )

//    val messageItem: MessageItem = MessageItem(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate"
//    )
//
//    val phoneItem: PhoneItem = PhoneItem(
//        "sister's number",
//        creationDate,
//        "phone",
//        89914424242
//    )
//
//    val listItem: ListItem = ListItem(
//        "todolist",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "buy new shoes")
//    )

    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89914424242
    )

    val listItem: NotesAppItem = ListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes")
    )

    println(messageItem.getItemData())
    println()
    println(phoneItem.getItemData())
    println()
    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NotesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}