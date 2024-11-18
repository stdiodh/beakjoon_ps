package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val x = nextInt(); val y = nextInt()
    val revX = x.toString().reversed().toInt()
    val revY = y.toString().reversed().toInt()
    val add = (revX + revY).toString().reversed().toInt()
    println(add)
}