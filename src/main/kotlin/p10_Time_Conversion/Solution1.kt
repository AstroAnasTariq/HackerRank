package p10_Time_Conversion

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // 10:45:32PM

    // 1.divide
    var hour = s.substring(0..1).toInt()
    var middle = s.substring(2..7)
    var amPm = s.substring(8..9)

    // 2.convert
    if (hour == 12 && amPm == "AM") {
        hour -= 12
    } else if (hour in 1..11 && amPm == "PM") {
        hour += 12
    }

    // 3.combine
    return if (hour < 10) {
        "0$hour$middle"
    } else {
        "$hour$middle"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
