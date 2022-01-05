fun main() {
    val number = readLine()!!.toString()
    var check = true
    for (i in 0 until number.length - 1) {
        if (number[i].toChar() + 1 !== number[i + 1].toChar()) {
            check = false
        }
    }
    print(check)
}