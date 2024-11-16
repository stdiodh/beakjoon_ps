package string

fun main(){
    val s = readln()
    var ans = ""

    for (word in s) {
        if (word.isUpperCase()) {
            var asc = word.code + 13
            if (asc > 90) asc -= 26
            ans += asc.toChar()
        }
        else if(word.isLowerCase()){
            var asc = word.code + 13
            if (asc > 122) asc -= 26
            ans += asc.toChar()
        }
        else
            ans += word
    }

    println(ans)
}