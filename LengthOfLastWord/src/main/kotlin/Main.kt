fun lengthOfLastWord(s: String): Int {
    var tempCursor = 0
    var tempStr = s
    while (tempStr[tempStr.length-1] == ' ') {
        tempStr = tempStr.substring(0, tempStr.length-1)
    }
    if (tempStr.indexOf(" ") == -1){
        return tempStr.length
    }
    for (i in s.indices){
        if (i < s.length - 1 && s[i] == ' ' && s[i + 1].isLetter()){
            //var tempStr = s.substring()
            tempCursor  = i
        }
    }
    tempStr = tempStr.substring(tempCursor + 1)
    //var tempStr = s.substring(s.lastIndexOf(" ")+1)
    //println(tempStr)
    return tempStr.length
}

fun main(args: Array<String>) {
    val tempStr = "a"
    println(lengthOfLastWord(tempStr))
    /*println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}