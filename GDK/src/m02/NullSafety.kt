package m02

fun main(arg: Array<String>) {
    // Error
    // var a: String = "Dicoding"
    // a = null

    var a: String? = "Google"
    a = null // Tidak error

    // Memeriksa Null
    // Menggunakan kondisi
    if(a != null && a.length > 0){
        println("String of length ${a.length}")
    } else {
        println("Empty String")
    }

    // Menggunakan Calls
    a?.length

    //Elvis Operator
    val company: String?
    company = "Wellard"
    val name: String = company ?: "default name"
    println(name)

    // !! Operator
    println(company!!.length) // Akan NPE jika compane == null

    // Filter list, a,bil yg tidak null
    val nullableList: List<Int?> = listOf(1,3,4,null, 6, 7)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)

}