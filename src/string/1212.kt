package string
/*
fun main(){
    val n = readln()
    val sb = StringBuilder()
    sb.append(n.toBigInteger(8).toString(2))
    println(sb)
}
 */

fun main() {
    val parser = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")
    val str = readln()

    if (str == "0") {
        println(0)
        return
    }

    val sb = StringBuilder()
    for (c in str) {
        sb.append(parser[c.digitToInt()])
    }

    println(sb.trimStart { it == '0' })
}