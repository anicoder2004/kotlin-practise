fun main(args: Array<String>) {

    val valid = ValidateCls()

    val a = valid.validatedInput("first number","Please enter a valid number")
    val b = valid.validatedInput("second number","Please enter a valid number")
    val c = valid.validatedInput("third number","Please enter a valid number")

    println("")

    if (a == b && b == c) { println("All three numbers are equal: $a") }

    else if (a == b && a < c) { println("The lowest number is $a (two same numbers)") }
    else if (a == c && a < b) { println("The lowest number is $a (two same numbers)") }
    else if (b == c && b < a) { println("The lowest number is $b (two same numbers)") }
    else {
        val lowest = if (a < b && a < c) { a }
                     else if (b < a && b < c) { b }
                     else { c }

        println("The lowest number is: $lowest")

    }
}