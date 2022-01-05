fun main() {
    val ticket = readLine()!!.toString()
    val first = ticket[0].toInt() + ticket[1].toInt() + ticket[2].toInt()
    val second = ticket[3].toInt() + ticket[4].toInt() + ticket[5].toInt()
    if (first == second) { print("Lucky")
    } else println("Regular")
}