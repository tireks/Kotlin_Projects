fun romanToInt(s: String): Int {
    var returnInt: Int = 0
    val tempMap = mapOf('M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50, 'X' to 10, 'V' to 5, 'I' to 1)
    if (s.length > 1) {
        for (i in s.indices) {
            if (i == 0) {
                if (tempMap.getValue(s[i]) >= tempMap.getValue(s[1])) {
                    returnInt += tempMap.getValue(s[i])
                }
            } else {
                when {
                    tempMap.getValue(s[i]) > tempMap.getValue(s[i - 1]) -> {
                        returnInt += tempMap.getValue(s[i]) - tempMap.getValue(s[i - 1])
                    }

                    tempMap.getValue(s[i]) == tempMap.getValue(s[i - 1]) -> {
                        returnInt += tempMap.getValue(s[i])
                    }

                    i < s.length - 1 && ((tempMap.getValue(s[i]) == tempMap.getValue(s[i + 1]))
                            || (tempMap.getValue(s[i]) > tempMap.getValue(s[i + 1]))) -> {
                        returnInt += tempMap.getValue(s[i])
                    }

                    i == s.length - 1 && (tempMap.getValue(s[i]) < tempMap.getValue(s[i - 1])) -> {
                        returnInt += tempMap.getValue(s[i])
                    }
                }
            }
        }
    } else {
        returnInt += tempMap.getValue(s[0])
    }
    return returnInt
}

fun main(args: Array<String>) {
    var str: String = "D"
    println(romanToInt(str))
}