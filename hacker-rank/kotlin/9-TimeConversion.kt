/*
 * Challenge 09
 *
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    var convertedTime = s
    val isPM = s.takeLast(2).lowercase() == "pm"

    if (isPM && s.take(2).toInt() < 12){
        convertedTime = s.replaceBefore(":", (s.take(2).toInt() + 12).toString())
    } else if (!isPM && s.take(2).toInt() == 12) {
        convertedTime = s.replaceBefore(":", "00")
    }

    return convertedTime.dropLast(2)
}

fun main(args: Array<String>) {
    var s = ""
    readlnOrNull()?.let {
        s = it
    }

    val result = timeConversion(s)

    println(result)
}
