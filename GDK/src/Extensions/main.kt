package Extensions

import java.util.*

fun main(args: Array<String>) {
    val date = Date()
    println(date.isTuesday())
}

fun Date.isTuesday(): Boolean {
    return day == 2
}