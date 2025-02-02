package binarySearch

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr1 = IntArray(n) { nextInt() }.sortedArray()

    val m = nextInt()
    val arr2 = IntArray(m) { nextInt() }

    fun binarySearch(arr: IntArray, target: Int) : Int {
        var start = 0; var end = arr.size - 1
        while(start <= end){
            val mid = (start + end) / 2
            if (arr[mid] == target) {
                return 1
            } else if (arr[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return 0
    }

    val sb = StringBuilder()
    for(x in arr2.indices){
        if(binarySearch(arr1, arr2[x]) == 1){
            sb.appendLine(1)
        } else {
            sb.appendLine(0)
        }
    }

    print(sb)
}