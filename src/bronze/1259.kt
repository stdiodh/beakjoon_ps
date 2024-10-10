package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }


    while(true){
        val n = nextInt()
        if(n == 0){
            break
        }

        if(n.toString() == n.toString().reversed()){
            println("yes")
        } else {
            println("no")
        }
    }
}