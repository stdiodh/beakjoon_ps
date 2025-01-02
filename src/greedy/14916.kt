package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    var n = nextInt()

    var ans = 0
    while(n > 0){
        if(n % 5 == 0){
            ans += n / 5
            break
        } else {
            n -= 2
            ans += 1
        }
    }
    if(n >= 0) print(ans) else print("-1")

}