package additional

import java.io.File

val File.nameWithoutExtension: String
    get() = name.substringBeforeLast(".")

fun main() {

    var file = File("textFile.txt")
    file.writeToFileAndSend()
    file.writeText("asdasd")

    println(file.nameWithoutExtension)

}

fun File.writeToFileAndSend() {
    val message = "some message for file"
    createNewFile()
    writeText(message)
    println("message = \"$message\" added to file $name and send")
}