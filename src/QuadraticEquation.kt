import kotlin.math.sqrt

fun main() {

    val valid = Validate()

    val a = valid.validatedInput("coefficient a","Please enter a valid number").toDouble()
    val b = valid.validatedInput("coefficient b","Please enter a valid number").toDouble()
    val c = valid.validatedInput("coefficient c","Please enter a valid number").toDouble()

    val d = b*b - 4*a*c

    if (d > 0) {
        val root1 = (-b + sqrt(d)) / (2*a)
        val root2 = (-b - sqrt(d)) / (2*a)

        println("Solutions to this Quadratic Equation are: x1 = ${"%.3f".format(root1)}, x2 = ${"%.3f".format(root2)}")
    }
    else if (d == 0.0) {
        val root = -b / (2 * a)

        println("Solution to this Quadratic Equation is: x1 = x2 = ${"%.3f".format(root)}")
    }
    else {
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-d) / (2 * a)

        println("Solution to this Quadratic Equation would be two imaginary numbers")
        println("Two complex solutions: x1 = ${"%.5f".format(realPart)} + ${"%.5f".format(imaginaryPart)}i, x2 = ${"%.3f".format(realPart)} - ${"%.3f".format(imaginaryPart)}i")
    }

}