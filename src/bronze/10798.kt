package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){

    val arr = Array(5) { CharArray(15) {' '} }

    val sb = StringBuilder()
    repeat(5){idx ->
        val input = readln()

        for(x in input.indices){
            arr[idx][x] = input[x]
        }
    }

    for (i in 0..<15) {
        for (j in 0..<5) {
            if (arr[j][i] != ' ') {
                sb.append(arr[j][i])
            }
        }
    }
    print(sb)
}