import java.util.HashMap
import java.util.PriorityQueue

class LRUCache(capacity: Int) {
    private val hashMap = HashMap<Int, Int>()
    private val timeQ : MutableMap<Int, Int> = mutableMapOf()
    private var priorityCursor : Int = 0
    private var size : Int = capacity

    fun get(key: Int): Int {
        if (hashMap.isNotEmpty() && hashMap.containsKey(key) && timeQ.contains(key)){
            priorityCursor++
            timeQ[key] = priorityCursor
            return hashMap.getValue(key)
        } else return -1
    }

    fun put(key: Int, value: Int) {
        if (hashMap.size == size && !hashMap.containsKey(key)){
            var minPrior = timeQ.minBy{it.value }?.key
            hashMap.remove(minPrior)
            timeQ.remove(minPrior)
        }
        hashMap[key] = value
        priorityCursor++
        timeQ[key] = priorityCursor
    }

}

fun main(args: Array<String>) {
    var obj = LRUCache(2)
    //var param_1 = obj.get(key)
    println(obj.get(2))
    obj.put(2, 6)
    println(obj.get(1))
    obj.put(1, 5)
    obj.put(1, 2)
    println(obj.get(1))
    println(obj.get(2))
    /*pobj.put(1, 1)rintln("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}