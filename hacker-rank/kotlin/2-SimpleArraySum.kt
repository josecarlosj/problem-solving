/*
 * Challenge 02
 *
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(ar: Array<Int>): Int {
    var total: Int = 0

    for (currentNumber in ar) {
        total += currentNumber
    }

    return total
}

fun main(args: Array<String>) {
    val arCount = readln().trim().toInt()

    val ar = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
