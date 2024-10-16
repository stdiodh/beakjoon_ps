package bronze

import java.io.StreamTokenizer
import kotlin.math.pow

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    repeat(nextInt()){
        val n = nextInt(); val m = nextInt()

        val num = ((n.toDouble().pow(2) + m.toDouble().pow(2)).toInt() + m) / (n * m)
    }
}