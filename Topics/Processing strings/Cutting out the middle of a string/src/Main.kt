fun main() {
    val word = readLine()!!.toString()
    if (word.length % 2 == 0) {
        for (i in 0 until word.length / 2 - 1) print(word[i].toChar())
        for (i in word.length / 2 + 1 until word.length) print(word[i].toChar())
    }
    if (word.length % 2 == 1) {
        for (i in 0 until word.length / 2) print(word[i].toChar())
        for (i in word.length / 2 + 1 until word.length) print(word[i].toChar())
    }
}