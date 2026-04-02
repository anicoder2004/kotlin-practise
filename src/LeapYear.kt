fun main(args: Array<String>) {

    print("Enter the first number: ")
    val year = readlnOrNull()?.toIntOrNull()
    println("")
    if (year == null) { println("Error! Enter a Valid Year!")
        return}
    else if (year % 4 == 0){ println("$year is a leap year")  }
    else { println("$year is not a leap year") }

}