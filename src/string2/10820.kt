package string2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        try {
            val line = br.readLine()

            var upper = 0
            var lower = 0
            var space = 0
            var num = 0

            for (i in line.indices) {
                val char = line[i]

                if (char == ' ') {
                    space++
                } else if (char.isDigit()) {
                    num++
                } else if (char.isLowerCase()) {
                    lower++
                } else {
                    upper++
                }
            }
            println("$lower $upper $num $space")
        } catch (e: Exception) {
            break
        }
    }
}