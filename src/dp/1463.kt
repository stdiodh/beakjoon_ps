package dp

import java.io.StreamTokenizer
import kotlin.math.min

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val d = IntArray(n+1) { 0 }

    for (x in 2.. n){
        d[x] = d[x - 1] + 1
        if(x % 2 == 0){
            d[x] = min(d[x], d[x / 2] + 1)
        }
        if(x % 3 == 0){
            d[x] = min(d[x], d[x / 3] + 1)
        }
    }
    print(d[n])
}