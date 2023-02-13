fun twoSum(nums: IntArray, target: Int): IntArray {
    val pairs = HashMap<Int, Int>()
    val returnArr = IntArray(2)
    for (i in nums.indices){
        if (pairs.isNotEmpty()){
            if (pairs.containsKey(target - nums[i])){
                returnArr[0] = pairs[target - nums[i]]!!
                returnArr[1] = i
            } else {
                pairs[nums[i]] = i
            }
        } else {
            pairs[nums[i]] = i
        }

    }
    return returnArr //placeholder
}

fun main(args: Array<String>) {
    val arr = intArrayOf(2,7,11,15)
    val target : Int = 9
    val returnal = twoSum(arr, target)
    var tempStr = returnal.contentToString()
    tempStr = tempStr.replace(" ", "")
    println(tempStr)

    /*println("Hello World!")

        // Try adding program arguments via Run/Debug configuration.
        // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
        println("Program arguments: ${args.joinToString()}")*/
}