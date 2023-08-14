import kotlin.io.*
import kotlin.text.*

/*
 * Challenge 07
 *
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    for(line in 1..n){
        for(column in 1..n){
            if(column <= n - line){
                print(" ")
            } else if(column == n){
                println("#")
            } else {
                print("#")
            }
        }
    }
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    staircase(n)
}
