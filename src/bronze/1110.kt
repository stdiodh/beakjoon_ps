package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun next(): Int {
        nextToken()
        return nval.toInt()
    }

    var input = next()
    var count = 1
    var ten = input / 10
    var one = input % 10

    var num = ten + one

    while(input != 0){
        ten = one
        one = num % 10
        num = ten + one

        if (input == (ten.toString() + one.toString()).toInt()) { break }
        count ++
    }

    print(count)
}