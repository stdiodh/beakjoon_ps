package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun next() : String { nextToken(); return sval }

    val s = next()
    val gather = arrayOf('a', 'e', 'i', 'o', 'u')
    var cnt = 0

    for(x in s.indices){
        if(s[x] in gather){
            cnt+=1
        }
    }
    println(cnt)
}