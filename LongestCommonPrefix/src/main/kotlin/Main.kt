fun longestCommonPrefix(strs: Array<String>): String {
    var tempStr0 = ""
    var tempStr1 = ""
    for (i in strs[0].indices){
        tempStr1 = strs[0].substring(0,i+1)
        for (j in 1 until strs.count()){
            if (strs[j].indexOf(tempStr1) != 0){
                return tempStr0
            }
        }
        tempStr0 = tempStr1
        //
    }
    return tempStr0 // placeholder
}

fun main(args: Array<String>) {
    val words : Array<String> = arrayOf("flower","flow","flight")
    println(longestCommonPrefix(words))

    /*println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}