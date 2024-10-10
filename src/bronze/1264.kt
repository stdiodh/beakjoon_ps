package bronze

fun main() {
    val gatherList = arrayListOf<String>("a", "e", "i", "o", "u")

    while(true){
        var cnt = 0
        val text = readln().lowercase().replace(" ", "")
        if(text == "#"){
            break
        }

        for(x in 0 until  text.length){
            for(y in 0..4){
                if(text[x] in gatherList[y]){
                    cnt++
                }
            }
        }
        println(cnt)
    }
}