package pSum

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()

    val arr1 = Array(n){ IntArray(m) { nextInt() } }
    val arr2 = Array(n){ IntArray(m) { nextInt() } }

    val sb = StringBuilder()
    repeat(n){x->
        repeat(m){y->
            sb.appendLine(arr1[x][y] + arr2[x][y])
        }
    }
    print(sb)
}