package pSum

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val arr = Array(9) { IntArray(9) { nextInt() } }
    var ans = arr[0][0]
    var row = 0; var col = 0
    repeat(9){x ->
        repeat(9){y ->
            if(ans <= arr[x][y]){
                ans = arr[x][y]
                row = x+1
                col = y+1
            }
        }
    }
    println(ans)
    print("$row $col")
}