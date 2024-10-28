package silver

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val fibo = IntArray(41 ){ 0 }
    fibo[1] = 1
    for(x in 2..40){
        fibo[x] = fibo[x-2] + fibo[x-1]
    }

    val sb = StringBuilder()
    repeat(nextInt()){
        val n = nextInt()

        if(n == 0){
            sb.appendLine("1 0")
        } else {
            sb.appendLine("${fibo[n-1]} ${fibo[n]}")
        }
    }
    println(sb)

}