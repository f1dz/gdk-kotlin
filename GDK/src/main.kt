import classes.nested.User

fun main(args: Array<String>) {

    // Nested class
    val user = User()
    user.Name("Raffasya").printName()
    user.Name("Devina").printName()
    User().Name("Khofidin").printName()

}