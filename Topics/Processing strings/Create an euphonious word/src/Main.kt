fun main() {
    val word = readLine()!!.toString()
    val aeiouy = "aeiouy"
    var letters = 0
    var vowels = 0
    var consonants = 0
    if (word != null) {
        for (i in word) {
            if (i.equals('a') || i.equals('e') || i.equals('i') || i.equals('o') || i.equals('u') || i.equals('y')) {
                vowels += 1
                consonants = 0
            } else {
                vowels = 0
                consonants += 1
            }
            if (vowels == 3 || consonants == 3) {
                letters += 1
                vowels = 1
                consonants = 1
            }

        }
    }
    print(letters)
}