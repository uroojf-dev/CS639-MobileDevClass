// lesson1_urooj.kts — Kotlin Basics (personalized demo)
// Demonstrates: vals/vars, string templates, null-safety, Elvis operator, loops, conditionals, and collections

// Immutable (val) vs Mutable (var)
val appName: String = "Intro to Kotlin by Urooj"   // <-- Replace "Urooj" with your own name if needed
var version = 1

println("Welcome to $appName v$version")

// String templates & expressions
val x = 10
val y = 4
println("x - y = ${x - y}")
println("x * y = ${x * y}")

// Null-safety: Safe call (?.) + Elvis (?:)
val maybeText: String? = null
val textLength = maybeText?.length ?: 0
println("Safe length = $textLength")

// Range & Loop
print("Counting up: ")
for (i in 1..5) print("$i ")
println()

// Conditional Expression
val temperature = 68
val weather = if (temperature > 75) "Warm" else "Cool"
println("Weather is: $weather")

// Collections
val scores = arrayListOf(85, 90, 78)
scores.add(95)
println("Scores: $scores | Total = ${scores.size}")

val passed = scores.filter { it >= 80 }
println("Passed Scores: $passed")

// Function Definition
fun greetUser(name: String) = println("Hello, $name! Welcome to Kotlin.")
greetUser("Urooj")   // <-- Replace your name here if needed

// Mutable variable update
version += 1
println("Exiting from $appName v$version")

