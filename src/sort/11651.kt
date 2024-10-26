package sort

/*
import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val arrX = Array(n) { 0 }
    val arrY = Array(n) { 0 }

    repeat(n) { idx ->
        arrX[idx] = nextInt()
        arrY[idx] = nextInt()
    }

    val XY = arrX.zip(arrY)
    val result = XY.sortedWith(compareBy({ it.second }, { it.first }))

    repeat(n){
        println("${result[it].first} ${result[it].second}")
    }
}
 */

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val pairs = Array(n) {Pair(0, 0)}
    repeat(n){ i->
        pairs[i] = Pair(nextInt(), nextInt())
    }
    pairs.sortWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first } )

    repeat(n){
        println("${pairs[it].first} ${pairs[it].second}")
    }
}