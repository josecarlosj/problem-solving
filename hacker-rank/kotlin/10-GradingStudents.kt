import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Challenge 10
 *
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Grade < 40 is falling grade
    // Arounding Rules
    //  - Difference between Grade and next multiple of 5 < 3, round grade to the next multiple of 5
    //  - If Grade < 38, no rounding
    // Ex:
    //    - 84 round to 85 (85 - 84 is less than 3)
    //    - 29 do not round (29 < 38)
    //    - 57 round to 60 (60 - 57 is 3 or higher)

    val resultArray = mutableListOf<Int>()

    grades.forEachIndexed { index, currentGrade ->

        if (index > 0) {
            if (currentGrade > 37) {
                val resultDivFive = currentGrade / 5
                val nextFive = (resultDivFive + 1) * 5

                val diff = nextFive - currentGrade

                if (diff < 3) {
                    resultArray.add(nextFive)
                } else {
                    resultArray.add(currentGrade)
                }

            } else {
                resultArray.add(currentGrade)
            }
        }
    }

    return resultArray.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readln().trim().toInt()

    val grades = Array<Int>(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readln().trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
