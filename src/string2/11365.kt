package string2

fun main(){
    while(true){
        val n = readln()
        if(n == "END"){
            break
        }
        val sb = StringBuilder()
        sb.appendLine(n.reversed())
        print(sb)
    }
}