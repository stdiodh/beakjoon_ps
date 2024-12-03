package pSum

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val pSum = IntArray(n+1) { 0 }
    repeat(n){
        pSum[it+1] = pSum[it] + nextInt()
    }

    val sb = StringBuilder()
    repeat(nextInt()){
        val i = nextInt(); val j = nextInt()
        sb.appendLine(pSum[j] - pSum[i-1])
    }
    print(sb)
}