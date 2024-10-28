package silver

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val sb = StringBuilder()
    repeat(nextInt()){
        val n = nextInt(); val m = nextInt()

        var result = 1

        for(i in 1..n){
            result = result * (m - i + 1) / i
        }
        sb.appendLine(result)
    }
    println(sb)
}