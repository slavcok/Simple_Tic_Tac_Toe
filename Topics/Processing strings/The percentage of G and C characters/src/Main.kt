fun main() {
    val number = readLine()!!.toString()
    var check = 0
    for (i in number.indices) {
        if (number[i].toInt() == 67 || number[i].toInt() == 99 || number[i].toInt() == 71 || number[i].toInt() == 103) {
            check += 1
        }
    }
    print(check.toDouble() / number.length * 100)
}