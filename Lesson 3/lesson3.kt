// lesson3_urooj.kt — Classes & Objects (customized)
// Demonstrates: inheritance, interfaces, data classes, companion objects, constructors, extension functions

interface Describable {
    fun describe(): String
}

open class Book(val title: String, val author: String) : Describable {
    init {
        require(title.isNotEmpty()) { "Book title cannot be empty" }
    }

    open fun type(): String = "General"

    override fun describe(): String = "\"$title\" by $author"

    companion object {
        fun fromPair(pair: Pair<String, String>) = Book(pair.first, pair.second)
    }
}

class CourseBook(title: String, author: String, val field: String) : Book(title, author) {
    override fun type(): String = "Course Book: $field"
}

data class Reader(val name: String, var age: Int) : Describable {
    constructor(name: String) : this(name, 0)

    override fun describe(): String = "Reader(name=$name, age=$age)"
}

fun Book.details(): String = "Book: ${title} by ${author} [${type()}]"

fun main() {
    val mainBook = Book("Kotlin Basics", "JetBrains")
    val course = CourseBook("Kotlin for Developers", "JetBrains", "Programming")

    println(mainBook.details())
    println(course.details())

    val extraBook = Book.fromPair("Advanced Kotlin" to "Marcin Moskala")
    println(extraBook.describe())

    val r1 = Reader("Urooj", 25)
    val r2 = r1.copy(age = 26)

    println(r1)
    println("r1 == r2? ${r1 == r2}")
    val (n, a) = r2
    println("Destructured -> name=$n age=$a")

    val things: List<Describable> = listOf(mainBook, course, r1)
    things.forEach { println("Describable: ${it.describe()}") }
}
