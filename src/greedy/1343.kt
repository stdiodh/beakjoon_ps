package greedy

fun main() {
    val br = System.`in`.bufferedReader()
    val str = br.readLine().replace("XXXX", "AAAA").replace("XX", "BB")
    if(str.contains('X')){
        print(-1)
    } else {
        print(str)
    }
}