package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val sb = StringBuilder()
    repeat(nextInt()){
        val a = nextInt(); val b = nextInt()
        var pow = a % 10
        repeat(b - 1){
            pow *= a
            pow %= 10
        }
        if(pow == 0){
            sb.appendLine(10)
        } else {
            sb.appendLine(pow)
        }
    }
    println(sb)
}