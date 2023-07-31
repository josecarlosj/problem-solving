/*
 * Challenge 003
 *
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var totalA = 0
    var totalB = 0

    for (position in 0..2){
        if(a[position] == b[position])
            continue

        if(a[position] > b[position]){
            totalA++
        } else {
            totalB++
        }
    }

    return arrayOf(totalA, totalB)
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
