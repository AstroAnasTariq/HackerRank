package p1_Solve_Me_First

import java.util.*

fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Add the first number:")
    val num1 = sc.nextInt()
    println("Add the second number:")
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println("The result is: $sum")
}