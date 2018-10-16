package classes.nested

class User {
    inner class Name(private val name: String) {
        fun printName(){
            println("Your name is $name")
        }
    }
}