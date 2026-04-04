fun validatedInput(label: String): Double {
    while (true) {
        print("Enter the $label: ")

        val input = readlnOrNull()?.toDoubleOrNull()

        if (input != null) {
            return input }

        println("Invalid input!! Please enter only numbers.")
        println("") }
}

fun main() {
    val a = validatedInput("first number")
    val b = validatedInput("second number")
    val c = validatedInput("third number")

    println("")
    if (a == b && b == c) { println("All three numbers are equal: $a") }

    else if (a == b && a > c) { println("The largest number is $a (two same numbers)") }
    else if (a == c && a > b) { println("The largest number is $a (two same numbers)") }
    else if (b == c && b > a) { println("The largest number is $b (two same numbers)") }
    else {
        val largest = if (a > b && a > c) { a }
                      else if (b > a && b > c) { b }
                      else { c }

        println("The largest number is: $largest")

    }
}