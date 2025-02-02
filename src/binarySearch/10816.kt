package binarySearch

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    val nArr = br.readLine().split(" ").map { it.toInt() }
    val nCount = mutableMapOf<Int, Int>()

    nArr.forEach {
        nCount[it] = nCount.getOrDefault(it, 0) + 1
    }

    val M = br.readLine().toInt()
    val mArr = br.readLine().split(" ").map { it.toInt() }

    val ans = mArr.map { nCount.getOrDefault(it, 0) }
    br.close()
    bw.write(ans.joinToString(" "))
    bw.flush()
    bw.close()
}