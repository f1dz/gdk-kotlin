import classes.enumclass.Gender
import classes.enumclass.User

fun main(args: Array<String>) {

    // Enum class
    User.NAME.print()
    User.EMAIL.print()
    User.PHONE.print()

    print(enumValues<Gender>().joinToString { it.name })
}