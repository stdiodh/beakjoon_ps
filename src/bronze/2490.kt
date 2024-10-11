package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }


    repeat(3) {
        val num = mutableListOf<Int>()
        repeat(4) {
            num.add(nextInt())
        }
        when(num.sum()){
            3 -> println("A")
            2 -> println("B")
            1 -> println("C")
            0 -> println("D")
            4 -> println("E")
        }
    }
}