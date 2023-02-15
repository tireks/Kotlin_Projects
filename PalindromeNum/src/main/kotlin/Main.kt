import kotlin.math.ceil

fun isPalindrome(x: Int): Boolean {
    var tempStrLeft = ""
    var tempStrRight = ""
    var middleIndex = 0
    //var tempStr = ""
    tempStrLeft = x.toString()
    middleIndex = ceil(tempStrLeft.length.toDouble() / 2).toInt()
    tempStrRight = if ((tempStrLeft.length % 2) == 0 ) {
        tempStrLeft.substring(middleIndex)
    } else {
        tempStrLeft.substring(middleIndex-1)
    }
    tempStrLeft = tempStrLeft.substring(0, middleIndex)
    tempStrRight = tempStrRight.reversed()
    return tempStrLeft == tempStrRight
    /*println(tempStrLeft)
    println(tempStrRight)
    return false*/
}

fun main(args: Array<String>) {
    isPalindrome(2345670)

   /* println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}