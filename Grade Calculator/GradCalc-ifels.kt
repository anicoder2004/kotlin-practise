fun validatedInput(): Int {
    while (true) {
        print("Enter your marks: ")

        val input = readlnOrNull()?.toIntOrNull()
        println("")

        if (input != null && input > 0) {
            return input }

        println("Invalid input!! Please enter your correct marks in numbers.")
        println("")
    }
}

fun main() {
    val mark = validatedInput()

    if (mark >= 80) { println("Your Grade is: A+") }
    else if (mark >= 70) { println("Your Grade is: A") }
    else if (mark >= 60) { println("Your Grade is: A-") }
    else if (mark >= 50) { println("Your Grade is: B") }
    else if (mark >= 40) { println("Your Grade is: C") }
    else { println("Your Grade is: F") }

}