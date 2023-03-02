import java.math.RoundingMode
import java.text.DecimalFormat

fun main(args: Array<String>) {
    val df = DecimalFormat("#.#########")
    df.roundingMode = RoundingMode.UP
    var a = 12.034501000000
    var b = df.format(a)
    println(b)
   /* println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")*/
}