package p7_Staircase

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
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase2(n: Int): Unit {
    for (line in 0 until n) {
        print(" ".repeat(n - line))
        println("#".repeat(line))
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}