package m02

fun main(arg: Array<String>) {
    val msg = {  println("Happy with Kotlin") }

    msg()

    val msg2 = { params: String -> println(params) }
    msg2("Hai Kotlin")

    val hitungLuas = { a: Int, b: Int -> a * b }
    println(hitungLuas(77, 55))
}