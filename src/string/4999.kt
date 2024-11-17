package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun next() : String { nextToken(); return sval }

    val j = next().split("h"); val d = next().split("h")
    val jl = j[0].length; val dl = d[0].length
    if(jl < dl) {
        println("no")
    } else {
        println("go")
    }
}