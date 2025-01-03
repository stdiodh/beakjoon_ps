package string3

import kotlin.math.min

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val cup = br.readLine()

    var prev = ' '
    var cnt = 0
    cup.forEach {
        if(it == prev){
            if(prev != 'L'){
                cnt++
                prev = 'L'
            } else {
                prev = ' '
            }
        } else {
            prev = it
            cnt++
        }
    }
    print(min(cnt+1, n))
}