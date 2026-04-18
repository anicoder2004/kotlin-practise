fun main() {

    val valid = Validate()

    val a = valid.validatedInput("the first number","Please enter a valid number")
    val b = valid.validatedInput("the second number","Please enter a valid number")

    println("")

    if (a > b) { println("The largest number is ${"%g".format(a)}") }
    else if (b > a) { println("The largest number is ${"%g".format(b)}") }
    else { println("Both numbers are equal: ${"%g".format(a)}") }

}