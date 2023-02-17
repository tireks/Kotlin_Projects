fun recursiveWorker(leftIndice : Int, rightIndice : Int, target : Int, nums: IntArray) : Int{
    var middle = (leftIndice + rightIndice) / 2
    var returnal = 0
    when {
        target > nums[middle] && (leftIndice < rightIndice) -> {
            returnal = recursiveWorker(middle + 1, rightIndice, target, nums)
        }
        target < nums[middle]  && (leftIndice < rightIndice)-> {
            returnal = recursiveWorker(leftIndice, middle - 1, target, nums)
        }
        target == nums[middle] -> {
            //dats all folks
            return middle
        }
        leftIndice >= rightIndice -> {
            when {
                target < nums[middle] -> {
                    return middle
                }
                target > nums[middle] -> {
                    return middle + 1
                }
            }
        }
    }
    return returnal
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var returnalInt = 0
    var leftIndice = 0
    var rightIndice = nums.size - 1
    return  recursiveWorker(leftIndice, rightIndice, target, nums)
}

fun main(args: Array<String>) {
    var arrnums = intArrayOf(3,5,7,9,10)
    var target = 8
    println(searchInsert(arrnums, target))
    /*println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}