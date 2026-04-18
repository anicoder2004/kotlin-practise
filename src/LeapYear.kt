fun main(args: Array<String>) {
    val valid = ValidateCls()

    val year = valid.validatedPostvInput("the year","Enter a Valid Year!")

    if (year % 4 == 0){ println("$year is a leap year")  }
    else { println("$year is not a leap year") }

}