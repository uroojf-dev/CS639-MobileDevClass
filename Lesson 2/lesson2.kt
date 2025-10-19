// lesson2_urooj.kt — Functions in Kotlin (customized)
// Demonstrates: function types, defaults, overloading, lambdas, higher-order calls, and when-expressions

// Simple function returning Unit
fun sayHello(person: String) {
    println("Hello, $person!")
}

// Function with default & named parameters
fun rectangleArea(length: Int = 1, breadth: Int = 1): Int {
    return length * breadth
}

// Function overloading (for squares)
fun rectangleArea(side: Int): Int {
    return side * side
}

// Regular arithmetic functions
fun sum(a: Int, b: Int): Int = a + b

// Lambda expression for multiplication
val multiplyNumbers: (Int, Int) -> Int = { x, y -> x * y }

// Higher-order function that takes an operation as an argument
fun operateOn(a: Int, b: Int, action: (Int, Int) -> Int): Int {
    return action(a, b)
}

// Function to classify numbers using when
fun describeNumber(num: Int): String {
    return when (num) {
        0 -> "zero"
        in 1..9 -> "one-digit"
        in 10..99 -> "two-digit"
        else -> "many digits"
    }
}

// Main execution block
fun main() {
    sayHello("Urooj")

    println("Default area: ${rectangleArea()}")
    println("Named args area: ${rectangleArea(breadth = 3, length = 5)}")
    println("Square area (overload): ${rectangleArea(6)}")

    println("operateOn(sum ref)   = ${operateOn(5, 3, ::sum)}")
    println("operateOn(lambda)    = ${operateOn(5, 3, multiplyNumbers)}")
    println("operateOn(inline)    = ${operateOn(5, 3) { m, n -> m - n }}")

    val nums = listOf(0, 5, 23, 124)
    for (n in nums) {
        println("$n is ${describeNumber(n)}")
    }
}
