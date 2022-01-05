fun main() {
    val text = readLine()!!.toString()
    val textReverse = text.reversed()
    var output = "yes"
    for (i in 0 until text.length) {
        if (text[i] != textReverse[i]) output = "no"
    }
   print(output)
}