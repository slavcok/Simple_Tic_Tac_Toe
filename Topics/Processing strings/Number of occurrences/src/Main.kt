fun main() {
    val sentence = readLine()!!.toString().toLowerCase()
    val substring = readLine()!!.toString().toLowerCase()
    val splitSentence = sentence.split(substring)
    print(splitSentence.lastIndex)
}