fun main(args: Array<String>) {

    print("Enter a number: ")
    val a = readlnOrNull()?.toIntOrNull()

    println("")

    if (a == null) { println("Error! Enter Only Real Numbers!")
        return}
    else if (a > 0){ println("$a is a positive number") }
    else if (a < 0){ println("$a is a negative number") }
    else { println("$a is Zero") }

}