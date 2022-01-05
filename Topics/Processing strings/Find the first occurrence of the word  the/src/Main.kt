fun main() {
    val number = readLine()!!.toString().toLowerCase()
    var check = - 1
    for (i in 0 until number.length - 2) {
        if (number[i] == 't' && number[i + 1] == 'h' && number[i + 2] == 'e') {
            check = i
            break
        }
    }
    print(check)
}