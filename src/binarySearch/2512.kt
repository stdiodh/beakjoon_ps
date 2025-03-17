package binarySearch

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr = IntArray(n) { nextInt() }
    val target = nextInt()
    val rnt = 0

    fun binarySearch(arr: IntArray, target: Int) : Boolean {
        var left = 1
        var right = arr.max()

        if(left > right){
            return false
        } else {
            while(left <= right){
                val mid = (left + right) / 2
                if(arr[mid] == target){
                    return true
                } else if (arr[mid] < target){
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return false
    }
}