fun removeDuplicates(nums: IntArray): Int {
    var returnalInt = 0
    var tempBuff = nums[0] - 1;
    var tempBuffIndices = -1
    for (i in nums.indices){
        if (nums[i] != tempBuff){
            returnalInt++
            tempBuff = nums[i]
            tempBuffIndices++
            nums[tempBuffIndices] = tempBuff
        }
    }
   // println(nums.contentToString())
    return returnalInt
}

fun main(args: Array<String>) {
    var tempArr = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicates(tempArr))
    //println(tempArr)
    /*println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}