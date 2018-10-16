import classes.DataClass.Student

fun main(args: Array<String>) {

    // Data class
    val student = Student()
    println("Your name is ${student.name}")
    println("Your major is ${student.major}")
    println("Your phone is ${student.phone}")

    val student2 = Student(phone = "081234477889")
    println("Your phone is ${student2.phone}")

    // Menyalin Data Classes dengan Modifikasi
    val studentA = student.copy(phone = "08189999927")
    println("Your phone is ${studentA.phone}")

    // Memetakan Objek Menjadi Variabel / destructuring declarations
    val studentB = Student("Raffasya", "IT", "08123000009")
    val (name, major, phone) = studentB
    println(name)
    println(major)
    println(phone)
}