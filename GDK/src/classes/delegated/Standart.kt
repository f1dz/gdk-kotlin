package classes.delegated

import kotlin.properties.Delegates

fun main(args: Array<String>){
    // Lazy
    println(lazyValue)
    println(lazyValue)

    // Observable
    val user = User()
    user.name = "first"
    user.name = "second"

    val user2 = User2(mapOf(
            "name" to "Ofid",
            "age" to 34,
            "address" to "Jakarta"
    ))

    println(user2.name)
    println(user2.age)
    println(user2.address)

}


// Lazy
val lazyValue: String by lazy {
    println("Computed!")
    "Hi Kotlin"
}

// Observable
class User {
    var name: String by Delegates.observable("<no name>"){
        prop, old, new ->
        println("$old -> $new")
    }

    // Vetoable
    var list: List<String> by Delegates.vetoable(emptyList()){
        _, old, new ->new.size > old.size
    }
}

// Menyimpan Properties ke dalam Map
class User2(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val address: String by map
}