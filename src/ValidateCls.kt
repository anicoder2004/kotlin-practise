class ValidateCls {

    fun validatedInput(enter: String, plus: String): Int {
        while (true) {
            print("Enter $enter: ")

            val input = readlnOrNull()?.toIntOrNull()

            if (input != null) {
                return input }

            println("Invalid input!! $plus")
            println("") }
    }

    fun validatedPostvInput(enter: String, plus: String): Int {
        while (true) {
            print("Enter $enter: ")

            val input = readlnOrNull()?.toIntOrNull()

            if (input != null && input > 0) {
                return input }

            println("Invalid input!! $plus")
            println("") }
    }


}