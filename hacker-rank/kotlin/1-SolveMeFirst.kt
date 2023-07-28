import java.util.*

/*
 * Challenge 001
 *
 * Complete the function solveMeFirst to compute the sum of two integers.
 */

fun solveMeFirst(a: Int, b: Int): Int {
    return a.plus(b)
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}
