package greedy

import java.io.StreamTokenizer
import kotlin.system.exitProcess

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    var t = nextInt()

    var a = 0; var b = 0; var c = 0
    if(t % 10 != 0){
        print("-1")
        exitProcess(0)
    } else {
        a = t / 300
        t %= 300
        b = t / 60
        t %= 60
        c = t / 10
    }

    print("$a $b $c")
}