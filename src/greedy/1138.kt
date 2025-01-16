package greedy

import java.io.*

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val n = nextInt()
    val list = IntArray(n) { nextInt() }
    val arr = IntArray(n) { 0 }

    for(i in 0 ..< n){
        var count = list[i]

        for(j in 0 ..< n) {
            if(count == 0) {
                if(arr[j] == 0) {
                    arr[j] = i+1
                    break
                }
            }
            else if(arr[j] == 0){
                count--
            }
        }
    }

    val sb = StringBuilder()
    arr.forEach { sb.append(it).append(" ") }
    print(sb)
}
