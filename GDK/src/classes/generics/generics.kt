package classes.generics


fun main(args: Array<String>){
    val stringType = TypedClass<String>("Hi Kotlin!")
    val intType = TypedClass<Int>(7)
    val nullType = TypedClass<String?>(null)

    println(stringType.value)
    println(intType.value)
    println(nullType.value)

    // labih sederhana
    val stringType2 = TypedClass("Hi Kotlin!")
    val intType2 = TypedClass(7)
    val nullType2 = TypedClass<String?>(null)

    println(stringType2.value)
    println(intType2.value)
    println(nullType2.value)

}

// generics
class TypedClass<T>(param: T) {
    val value: T = param

}

// Variance

class TypedClassVarianceIn<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

class TypedClassVarianceOut<out T>(private val value: T){
    fun get(): T {
        return value
    }
}
