package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val arr = Array(9) { IntArray(9) {nextInt()} }
    var max = 0; var row = 0; var col = 0

    repeat(9){idx ->
        repeat(9){jdx ->
            if(arr[idx][jdx] > max){
                max = arr[idx][jdx]
                row = idx
                col = jdx
            }
        }
    }
    println("$max\n ${row + 1} ${col + 1}")
}