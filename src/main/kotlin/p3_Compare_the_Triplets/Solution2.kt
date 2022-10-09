package p3_Compare_the_Triplets

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets2(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreForAlica = 0
    var scoreForBob = 0

    for (i in 0..2){
        if (a[i] > b[i]) {scoreForAlica+=1}
        if (a[i] < b[i]) {scoreForBob+=1}
    }
    return arrayOf(scoreForAlica, scoreForBob)
}

fun main() {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
