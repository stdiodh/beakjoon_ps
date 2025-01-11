package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr1 = IntArray(n) { nextInt() }.sortedArray()
    val arr2 = IntArray(n) { nextInt() }.sortedArrayDescending()

    var ans = 0
    for(x in 0..< n){
        ans += arr1[x] * arr2[x]
    }
    print(ans)
}