package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    repeat(nextInt()) {
        val n = nextInt().toString(2)
        val nList = n.toList().reversed()

        for(x in nList.indices){
            if(nList[x] == '1'){
                print("$x ")
            }
        }
        println()
    }
}