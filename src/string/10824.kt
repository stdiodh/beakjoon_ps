package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun next() : Long {nextToken(); return nval.toLong()}
    val a = next(); val b = next(); val c = next(); val d = next()
    val ab = a.toString()+b.toString(); val cd = c.toString()+d.toString()
    val sb = StringBuilder()
    sb.append(ab.toLong() + cd.toLong())
    println(sb)
}