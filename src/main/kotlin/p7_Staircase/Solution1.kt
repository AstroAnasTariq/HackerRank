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

fun staircase(n: Int): Unit {
    for (line in 0 until n) {
        val spaces = n - line - 1
        val hashes = line + 1

        for (i in 1..spaces) {
            print(" ")
        }

        for (i in 1..hashes){
            print("#")
        }

        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
//n = 4           Line      n-Line-hashes   Line+1
//                Line      n-Line-1        Line+1
//   # -> SSSH -> Line: 0   Spaces: 3   Hashes: 1
//  ## -> SSHH -> Line: 1   Spaces: 2   Hashes: 2
// ### -> SHHH -> Line: 2   Spaces: 1   Hashes: 3
//#### -> HHHH -> Line: 3   Spaces: 0   Hashes: 4