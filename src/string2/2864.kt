package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val A = nextInt().toString(); val B = nextInt().toString()
    println(
        "${A.replace("6", "5").toInt() + B.replace("6", "5").toInt()} "
                + "${A.replace("5", "6").toInt() + B.replace("5", "6").toInt()}"
    )
}