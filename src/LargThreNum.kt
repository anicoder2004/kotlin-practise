fun main(args: Array<String>) {

    print("Enter the first number: ")
    val a = readlnOrNull()?.toIntOrNull()
    if (a == null) { println("Error! Enter Only Real Numbers!")
        return}

    print("Enter the second number: ")
    val b = readlnOrNull()?.toIntOrNull()
    if (b == null) { println("Error! Enter Only Real Numbers!")
    return}

    print("Enter the third number: ")
    val c = readlnOrNull()?.toIntOrNull()
    if (c == null) { println("Error! Enter Only Real Numbers!")
    return}

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