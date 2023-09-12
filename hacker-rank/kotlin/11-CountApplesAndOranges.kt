/*
 * Challenge 11
 *
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    val applesResult = apples.map { it + a }
    val orangesResult = oranges.map { it + b }

    var totalApplesHouse = 0
    applesResult.forEach {
        if (it in s..t){
            totalApplesHouse++
        }
    }

    var totalOrangesHouse = 0
    orangesResult.forEach {
        if (it in s..t){
            totalOrangesHouse++
        }
    }

    println(totalApplesHouse)
    print(totalOrangesHouse)
}

fun main(args: Array<String>) {
    val first_multiple_input = readln().trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readln().trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readln().trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}