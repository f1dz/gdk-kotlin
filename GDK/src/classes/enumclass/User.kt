package classes.enumclass

enum class User(val field: String) {
    NAME("Khofidin"){
        override fun print(){
            println("Your name is $field")
        }
    },
    EMAIL("offiedz@gamil.com"){
        override fun print(){
            println("Your email is $field")
        }
    },
    PHONE("081230999936"){
        override fun print(){
            println("Your phone is $field")
        }
    };

    abstract fun print()
}