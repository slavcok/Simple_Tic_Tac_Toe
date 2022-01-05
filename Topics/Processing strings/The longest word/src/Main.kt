fun main() {
    var long = 0
    var index = "0"
    val numbers = readLine()!!.split(" ").map { it.toString() }.toMutableList()
    for (i in 0 until numbers.size) {
        if (numbers[i].length > long) {
            long = numbers[i].length
            index = numbers[i]
        }
    }
    print(index)
}