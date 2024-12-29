package string3

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String { nextToken(); return sval }

    val str = nextString()
    val sb = StringBuilder()
    for(x in str){
        if(x < 68.toChar()){
            sb.append("${x + 23}")
        } else {
            sb.append(x - 3)
        }
    }
    print(sb)
}