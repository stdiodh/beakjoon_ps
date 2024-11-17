package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun next() : String { nextToken(); return sval }

    val hashMap = HashMap<String, Int>()

    repeat(nextInt()){
        val book = next()
        hashMap[book] = hashMap.getOrDefault(book, 0) + 1
    }
    val sortedList = hashMap.toList().sortedWith(compareBy({-it.second}, {it.first}))
    println(sortedList[0].first)
}