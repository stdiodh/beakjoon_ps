package string

fun main() {
    val T = readln().toInt()
    repeat(T) {
        val nm = readln().split(",")
        println(nm[0].toInt() + nm[1].toInt())
    }
}