package classes.functions

fun main(args: Array<String>) {
    println(sum(10,50))
    println(sum2(10,50))
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int) = x + y