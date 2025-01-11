package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val atm = IntArray(n+1) { 0 }

    for(i in 1..n){
        atm[i] = nextInt()
    }
    atm.sort()

    var ans = 0
    var result = 0
    for(x in 1..n){
        ans += atm[x-1]
        result += ans + atm[x]
    }
    print(result)
}