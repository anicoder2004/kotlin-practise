fun main(args: Array<String>) {

    print("Enter the first number: ")
    val a = readlnOrNull()?.toIntOrNull()
    if (a == null) { println("Error! Enter Only Real Numbers!")
        return}

    print("Enter the second number: ")
    val b = readlnOrNull()?.toIntOrNull()
    if (b == null) { println("Error! Enter Only Real Numbers!")
        return}

    println("")

    if (a > b) { println("The largest number is $a") }
    else if (b > a) { println("The largest number is $b") }
    else { println("Both numbers are equal: $a") }

}