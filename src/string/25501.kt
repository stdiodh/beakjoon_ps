package string

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun next() : String { nextToken(); return sval }

    var cnt = 1
    val sb = StringBuilder()

    fun recursion(s : String, l : Int, r : Int) : Int{
        if(l >= r) {return 1}
        else if(s[l] != s[r]) {return 0}
        else {
            cnt++
            return recursion(s, l+1, r-1)
        }
    }

    fun isPalindrome(s : String): Int {
        return recursion(s, 0, s.length-1)
    }

    repeat(nextInt()){
        val t = next()
        sb.append(isPalindrome(t))
        sb.append(" $cnt\n")
        cnt = 1
    }
    println(sb)
}