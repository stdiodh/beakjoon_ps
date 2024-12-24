package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val n = nextInt(); val vote = nextString()
    val result = IntArray(2) { 0 }

    vote.forEach {
        result[it - 'A']++
    }

    if(result[0] > result[1]){
        print("A")
    } else if(result[1] > result[0]){
        print("B")
    } else {
        print("Tie")
    }
}