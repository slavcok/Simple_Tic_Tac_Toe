package tictactoe

fun main() {
    var m = Array(3) {Array(3) {' '} }
    var xOrO = true
    var inputXOrO = 'X'

    printArray(m)

    var programRunning = true
    do {
        testInput(m, inputXOrO)

        printArray(m)
        programRunning = test(m)

        if (xOrO) {
            inputXOrO = 'O'
        } else inputXOrO = 'X'
        xOrO = !xOrO
    } while (programRunning)
}

fun test(m: Array<Array<Char>>) : Boolean {
    var x = 0
    var o = 0
    for (i in 0..2) {
        for (j in 0..2) {
            if (m[i][j] == 'O') o += 1
            if (m[i][j] == 'X') x += 1
        }
    }

    var xWin = false
    var oWin = false
    for (i in 0..2) {
        if (m[i][0] == 'O' && m[i][1] == 'O' && m[i][2] == 'O') oWin = true
        if (m[i][0] == 'X' && m[i][1] == 'X' && m[i][2] == 'X') xWin = true
    }
    for (i in 0..2) {
        if (m[0][i] == 'O' && m[1][i] == 'O' && m[2][i] == 'O') oWin = true
        if (m[0][i] == 'X' && m[1][i] == 'X' && m[2][i] == 'X') xWin = true
    }
        if (m[0][0] == 'O' && m[1][1] == 'O' && m[2][2] == 'O') oWin = true
        if (m[0][0] == 'X' && m[1][1] == 'X' && m[2][2] == 'X') xWin = true
        if (m[2][0] == 'O' && m[1][1] == 'O' && m[0][2] == 'O') oWin = true
        if (m[2][0] == 'X' && m[1][1] == 'X' && m[0][2] == 'X') xWin = true

    if (o > (x + 1) || x > (o + 1)) {
        println("Impossible")
    } else if (xWin && oWin) {
        println("Impossible")
    } else if (xWin) {
        println("X wins")
        return false
    } else if (oWin) {
        println("O wins")
        return false
    } else if (x + o == 9) {
        println("Draw")
        return false
    }
    return true
}

fun testInput(m: Array<Array<Char>>, inputXOrO: Char) {
    var wrongInput = true

    do {
        println("Enter the coordinates: ")
        val (tX, tY) = readLine()!!.split(" ")
        val turnX = tX.toInt()
        val turnY = tY.toInt()
        if ( turnX < 1 || turnX > 3 || turnY < 1 || turnY > 3) {
            println("Coordinates should be from 1 to 3!")
        } else if ((turnX.toChar().isDigit() && turnY.toChar().isDigit())) {
            println("You should enter numbers!")
        } else if (m[turnX - 1][turnY - 1] == 'O' || m[turnX - 1][turnY - 1] == 'X') {
            println("This cell is occupied! Choose another one!")
        } else {
            wrongInput = false
            m[turnX - 1][turnY - 1] = inputXOrO
        }
    } while (wrongInput)
}

fun printArray(m: Array<Array<Char>>) {
    println("---------")
    for (i in 0..2) {
        print("|")
        for (j in 0..2) {
            print(" ")
            print(m[i][j])
        }
        println(" |")
    }
    println("---------")
}
