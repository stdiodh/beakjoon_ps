package string3

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val sb = StringBuilder()
    repeat(nextInt()){
        val n = nextInt(); val str = nextString()
        for(x in str.indices){
            if(x == n-1){
                continue
            }
            sb.append(str[x])
        }
        sb.appendLine()
    }
    print(sb)
}