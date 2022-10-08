package p2_Simple_Array_Sum

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0
    for (element in ar){
    sum += element
    }
    return sum
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}