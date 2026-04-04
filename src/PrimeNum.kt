import kotlin.math.sqrt

fun main() {
    val num = validatedNum()

    if (num <= 1) { println("$num is not a prime number.")
        return }

    // Down bellow is fully gpt generated.
    // Didn't understand any logic of this for loop below
    // But it works.

    var isPrime = true
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) { println("$num is a prime number.") }
    else { println("$num is not a prime number.") }

}