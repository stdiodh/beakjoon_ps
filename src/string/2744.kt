package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String { nextToken(); return sval}

    val input = nextString()
    val sb = StringBuilder()
    for(x in input){
        if(x.isLowerCase()){
            sb.append(x.uppercase())
        } else {
            sb.append(x.lowercase())
        }
    }
    println(sb)
}