package silver

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    var n = nextInt()

    repeat(n){
        val str = nextString()
        val history = mutableListOf<Char>()
        for(x in str){
            if (!history.contains(x)){
                history.add(x)
            } else if (history.last() != x) {
                n -= 1
                break
            }
        }
    }
    println(n)
}