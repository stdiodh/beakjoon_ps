package string

fun main() {
    val sb = StringBuilder()
    repeat(readln().toInt()){
        val s = readln().split(" ")
        sb.appendLine(s.joinToString(" ") { it.reversed() })
    }
    println(sb)
}