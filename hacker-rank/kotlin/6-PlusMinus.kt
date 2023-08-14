/*
 * Challenge 06
 *
 * Complete the 'plusMinus' function below. Challenge 06
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    val arrSize = arr.size
    var amountPositive = 0.0f
    var amountNegative = 0.0f
    var amountZero = 0.0f

    arr.forEach {
        if (it == 0){
            amountZero += 1
        } else if (it > 0){
            amountPositive += 1
        } else {
            amountNegative += 1
        }
    }

    val positiveRatio: Float = amountPositive/arrSize
    val negativeRatio: Float = amountNegative/arrSize
    val zeroRatio: Float = amountZero/arrSize

    val roundedPositive = String.format("%.6f", positiveRatio)
    val roundedNegative = String.format("%.6f", negativeRatio)
    val roundedZero = String.format("%.6f", zeroRatio)

    println(roundedPositive)
    println(roundedNegative)
    println(roundedZero)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

