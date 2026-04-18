package gradcalc
import Validate

fun main() {
    val valid = Validate()

    val mark = valid.validatedPostvInput("your mark","Enter a Valid Mark!")

    if (mark >= 80) { println("Your Grade is: A+") }
    else if (mark >= 70) { println("Your Grade is: A") }
    else if (mark >= 60) { println("Your Grade is: A-") }
    else if (mark >= 50) { println("Your Grade is: B") }
    else if (mark >= 40) { println("Your Grade is: C") }
    else { println("Your Grade is: F") }

}