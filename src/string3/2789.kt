package string3

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val str = br.readLine().map { if ( it in "CAMBRIDGE") "" else it }.joinToString("")
    bw.write(str)
    bw.flush()
    bw.close()
    br.close()
}