package p6_Plus_Minus

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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positives = 0
    var negatives = 0
    var zeros = 0

    for (number in arr){
        when {
            number > 0 -> positives += 1
            number < 0 -> negatives += 1
            else -> zeros += 1
        }
    }
    val size = arr.size.toDouble()
    println("%.6f".format(positives / size))
    println("%.6f".format(negatives / size))
    println("%.6f".format(zeros / size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
