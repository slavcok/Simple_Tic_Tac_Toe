fun main() {
    val date = readLine()!!.toString()
    val dateList: List<String> = date.split("-")
    print(dateList[1] + "/" + dateList[2] + "/" + dateList[0])
}