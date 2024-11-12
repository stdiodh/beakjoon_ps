package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String { nextToken(); return sval }

    val s = nextString()
    //Set은 의미 그대로 집합처럼 중복되지 않는, 고유한 원소만을 갖는다.
    val sList = HashSet<String>()

    for(x in s.indices){
        for(y in x + 1..s.length){
            sList.add(s.substring(x, y))
        }
    }
    println(sList.size)
}