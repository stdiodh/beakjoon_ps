package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun next() : String { nextToken(); return sval }
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr = Array(n){next()}

    val list = arr.groupingBy { it[0] }.eachCount().filter { it.value >= 5 }.keys.sorted().joinToString("")
    if(list.isEmpty()){
        println("PREDAJA")
    } else {
        println(list)
    }
}