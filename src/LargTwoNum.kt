fun main() {

    val a = validatedInput("first number")
    val b = validatedInput("second number")

    println("")

    if (a > b) { println("The largest number is ${"%g".format(a)}") }
    else if (b > a) { println("The largest number is ${"%g".format(b)}") }
    else { println("Both numbers are equal: ${"%g".format(a)}") }

}