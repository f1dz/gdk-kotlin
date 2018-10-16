import classes.Sealed.Operation

fun main(args: Array<String>) {

    // Sealed class
    val result = execute(10, Operation.Multiply(90))
    println(result)

}

fun execute(x: Int, operation: Operation): Int = when (operation) {
    is Operation.Add -> operation.value + x
    is Operation.Divide -> operation.value / x
    is Operation.Multiply -> operation.value * x
    is Operation.Substract -> operation.value - x
}