fun main() {
    val number = readLine()!!.toString()
    var nFirst = 0
    var nLast = 0
    for (i in 0 until number.length / 2) {
        nFirst += number[i].toInt()
    }
    for (i in number.length / 2 until number.length) {
        nLast += number[i].toInt()
    }
    if (nFirst == nLast) {
        print("YES")
    } else print("NO")
}