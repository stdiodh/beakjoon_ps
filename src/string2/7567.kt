package string2

fun main(){
    val n = readln()
    var h = 10
    for(x in 1 ..< n.length){
        if(n[x-1] == n[x]){
            h += 5
        } else {
            h += 10
        }
    }
    println(h)
}