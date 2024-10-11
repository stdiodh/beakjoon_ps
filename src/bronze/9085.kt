package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    repeat(nextInt()){
        val k = nextInt()
        val num = mutableListOf<Int>()
        repeat(k){
            num.add(nextInt())
        }
        println(num.sum())
    }
}