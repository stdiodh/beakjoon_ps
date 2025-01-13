package greedy

import java.io.StreamTokenizer
import kotlin.math.min

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){

    fun nextInt() : Int { nextToken(); return nval.toInt() }
    var n = nextInt(); val m = nextInt()
    val arr1 = Array(m) { 0 }
    val arr2 = Array(m) { 0 }

    for(i in 0..< m){
        arr1[i] = nextInt(); arr2[i] = nextInt()
    }
    arr1.sort()
    arr2.sort()

    var ans = 0
    while(n > 0){
        if(n >= 6){
            ans += min(arr1[0], arr2[0] * 6)
            n -= 6
        } else {
            ans += min(arr1[0], arr2[0] * n)
            n = 0
        }
    }
    print(ans)
}