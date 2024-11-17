package string

fun main(){
    while(true){
        val t = readln()
        if(t == "#"){
            break
        }

        val tLower = t.lowercase()

        val gather = arrayOf('a', 'e', 'i', 'o', 'u')
        var cnt = 0
        for(x in t.indices){
            for(y in gather.indices){
                if(tLower[x] == gather[y]){
                    cnt++
                }
            }
        }
        println(cnt)
    }
}