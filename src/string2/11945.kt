package string2

fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    val arr = Array(n) { readln() }

    arr.forEach { println(it.reversed()) }
}