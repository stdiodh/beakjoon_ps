package string2

fun main() {
    val n = readln().toInt()
    val arr = Array(n){ readln() }

    var cnt = 1
    for(x in arr.indices){
        println("$cnt. " + arr[x])
        cnt++
    }
}