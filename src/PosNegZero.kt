fun main() {
    val valid = ValidateCls()

    val a = valid.validatedInput("The Number","Please enter a valid number")

    println("")

    if (a > 0){ println("$a is a positive number") }
    else if (a < 0){ println("$a is a negative number") }
    else { println("$a is Zero") }

}