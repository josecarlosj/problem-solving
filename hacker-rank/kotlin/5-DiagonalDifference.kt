import kotlin.math.abs

/*
 * Challenge 05
 *
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var ltrDiagonalTotal = 0
    var rtlDiagonalTotal = 0

    var rtlAuxI = 0
    var rtlAuxJ = arr.size - 1

    for (i in arr.indices) {
        for (j in arr[i].indices) {
            if (i == j){
                ltrDiagonalTotal += arr[i][j]
            }

            if(i == rtlAuxI && j == rtlAuxJ){
                rtlDiagonalTotal += arr[i][j]

                rtlAuxI += 1
                rtlAuxJ -= 1
            }
        }
    }

    val totalAbs: Int = ltrDiagonalTotal - rtlDiagonalTotal

    return abs(totalAbs)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
