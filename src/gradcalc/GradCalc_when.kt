package gradcalc
import ValidateCls

fun main() {
    val valid = ValidateCls()

    val mark = valid.validatedPostvInput("your mark","Enter a Valid Mark!")

    when{
        mark >= 80 -> println("Your Grade is: A+")
        mark >= 70 -> println("Your Grade is: A")
        mark >= 60 -> println("Your Grade is: A-")
        mark >= 50 -> println("Your Grade is: B")
        mark >= 40 -> println("Your Grade is: C")
        else -> println("Your Grade is: F")
    }

}