package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val n = nextInt(); val m = nextInt()
    val nArr = HashSet<String>(n)

    repeat(n){
        nArr.add(nextString())
    }

    var cnt = 0

    repeat(m){
        if(nArr.contains(nextString())){
            cnt++
        }
    }
    println(cnt)
}