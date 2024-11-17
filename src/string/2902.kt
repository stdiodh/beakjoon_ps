package string

fun main(){
    val t = readln()
    val KMP = t.split("-")
    val sb = StringBuilder()
    for(x in 0..< KMP.size){
        sb.append(KMP[x][0])
    }
    println(sb)
}