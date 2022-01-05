fun main() {
    var (s, ss) = readLine()!!.split(" ")
    val n = ss.toInt()
    if (s.length > n) {
        print(s.substring(n, s.length))
        print(s.substring(0, n))
    } else print(s)
}