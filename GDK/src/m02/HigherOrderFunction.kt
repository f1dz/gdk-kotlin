package m02

fun main(arg: Array<String>) {
    val name: (String, String) -> String = { realName, heroName -> "My name is $realName, you can call me $heroName"}
    getNickName("Khofidin", "Ofid", name)

    getNickName("Nur Rohman", "Rohmen", {
        realName, heroName -> "My name is $realName, you can call me $heroName"
    })

    getNickName("Raffasya Najwan", "Raffa") { realName, heroName -> "My name is $realName, you can call me $heroName"}
}

fun getNickName(fullName: String, nickName: String, yourName: (String, String) -> String) {
    val result = yourName(fullName, nickName)
    println(result)
}