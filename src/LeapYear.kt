fun validatedYear(): Int {
    while (true) {
        print("Enter the year: ")

        val input = readlnOrNull()?.toIntOrNull()

        if (input != null && input > 0) { println("")
            return input }

        println("Error! Enter a Valid Year!")
        println("")
    }
}

fun main(args: Array<String>) {

    val year = validatedYear()

    if (year % 4 == 0){ println("$year is a leap year")  }
    else { println("$year is not a leap year") }

}