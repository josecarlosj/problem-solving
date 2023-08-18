/*
 * Challenge 08
 *
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var minSum = 0L
    var maxSum = 0L

    arr.sort()

    for(currentIndex in 0..(arr.lastIndex)){
        if (currentIndex > 0) {
            maxSum += arr[currentIndex]
        }

        if (currentIndex < arr.lastIndex) {
            minSum += arr[currentIndex]
        }
    }

    print("$minSum $maxSum")

}

fun main(args: Array<String>) {

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
