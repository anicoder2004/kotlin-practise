fun main() {

    val valid = ValidateCls()

    val a = valid.validatedInput("the first number","Please enter a valid number")
    val b = valid.validatedInput("the second number","Please enter a valid number")

    println("")

    if (a > b) { println("The largest number is $a") }
    else if (b > a) { println("The largest number is $b") }
    else { println("Both numbers are equal: $a") }

}