fun main() {

    val valid = Validate()

    val a = valid.validatedInput("the first number","Please enter a valid number")
    val b = valid.validatedInput("the second number","Please enter a valid number")
    val c = valid.validatedInput("the third number","Please enter a valid number")

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