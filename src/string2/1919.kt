package string2

import java.io.StreamTokenizer
import kotlin.math.abs

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String {
        nextToken()
        return sval
    }

    val str1 = nextString(); val str2 = nextString()
    var word1 = IntArray(26){ 0 }
    var word2 = IntArray(26){ 0 }
    str1.forEach {
        word1[it - 'a']++
    }
    str2.forEach {
        word2[it - 'a']++
    }

    var sum = 0
    for(x in 0 until 26){
        if(word1[x] != word2[x]){
            sum += abs(word1[x] - word2[x])
        }
    }
    print(sum)
}