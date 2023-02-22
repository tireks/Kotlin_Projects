

fun isValidSudoku(board: Array<CharArray>): Boolean {
    var flag : Boolean = false
    val bufferHashStr = HashMap <Char, Int>()
    val bufferHashCol = HashMap <Char, Int>()
    val bufferHashBlock = HashMap <Char, Int>()
    for (i in 0..8) {
        if ((!tryString(board[i], bufferHashStr)) || (!tryColumn(i, board, bufferHashCol)) || (!tryBlock(i, board,bufferHashBlock))){
            println("ALARM ALL")
            return false
        }
        bufferHashStr.clear()
        bufferHashCol.clear()
        bufferHashBlock.clear()
    }

    return true
}

fun tryBlock(i: Int, board: Array<CharArray>, bufferHashBlock: HashMap<Char, Int>): Boolean {
    var cursCol = i / 3 * 3
    var cursStr = (i % 3) * 3
    for (i in cursCol .. cursCol + 2) {
        for (j in cursStr .. cursStr + 2) {
            if (board[i][j] != '.') {
                if (bufferHashBlock.containsKey(board[i][j])) {
                    println("ALARM BLOCK $i")
                    return false
                } else {
                    bufferHashBlock[board[i][j]] = i * j
                }
            }
        }
    }
    return true
}

fun tryColumn(i: Int, board: Array<CharArray>, bufferHashCol: HashMap<Char, Int>) :Boolean {
    for (k in 0..8){
        if (board[k][i] != '.'){
            if(bufferHashCol.containsKey(board[k][i])){
                println("ALARM COL $i")
                return false
            }
            else {
                bufferHashCol[board[k][i]] = k
            }
        }

    }
    return true
}

fun tryString(board: CharArray, bufferHashStr: HashMap<Char, Int>): Boolean {
    for (j in 0..8){
        if (board[j] != '.') {
            if (bufferHashStr.containsKey(board[j])) {
                println("ALARM Str$board")
                return false
            } else {
                bufferHashStr[board[j]] = j
            }
        }
    }
    return true
}

fun main(args: Array<String>) {
    val charArray1 = "53..7....".toCharArray()
    val charArray2 = "6..195...".toCharArray()
    val charArray3 = ".98....6.".toCharArray()
    val charArray4 = "8...6...3".toCharArray()
    val charArray5 = "4..8.3..1".toCharArray()
    val charArray6 = "7...2...6".toCharArray()
    val charArray7 = ".6....28.".toCharArray()
    val charArray8 = "...419..5".toCharArray()
    val charArray9 = "....8..79".toCharArray()
    val char : Array<CharArray> = arrayOf<CharArray>(charArray1, charArray2, charArray3, charArray4, charArray5, charArray6, charArray7, charArray8, charArray9)
    println(charArray1.contentToString())
    println(isValidSudoku(char))
    /*println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}