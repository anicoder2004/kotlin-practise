fun validatedNum(): Int {
    while (true) {
        print("Enter a number: ")
        val input = readlnOrNull()?.toIntOrNull()

        if (input != null) { println("")
            return input }

        println("Error! Enter a Valid Number!")
        println("")
    }
}

fun main() {
    val a = validatedNum()

    println("")

    if (a > 0){ println("$a is a positive number") }
    else if (a < 0){ println("$a is a negative number") }
    else { println("$a is Zero") }

}