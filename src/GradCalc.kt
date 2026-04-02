fun main() {

    print("Enter your marks: ")
    val mark = readlnOrNull()?.toIntOrNull()

    if (mark == null || mark<0 || mark>100) { println("Invalid input!") }
    else if (mark >= 80) { println("Your Grade is: A+") }
    else if (mark >= 70) { println("Your Grade is: A") }
    else if (mark >= 60) { println("Your Grade is: A-") }
    else if (mark >= 50) { println("Your Grade is: B") }
    else if (mark >= 40) { println("Your Grade is: C") }
    else { println("Your Grade is: F") }

}