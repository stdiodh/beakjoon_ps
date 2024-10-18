package pSum

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextint() : Int {
        nextToken()
        return nval.toInt()
    }

    //n의 수열의 크기 m은 i 부터 j 까지의 합
    val n = nextint(); val m = nextint()
    val pSum = IntArray(n+1) {
        0
    }





}