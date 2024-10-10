package bronze

fun main() {
    var n = readln().toInt()
    var count = 0
    var k = 1

    while(n > 0){
        if(k > n){
            k = 1
        }
        n -= k
        k += 1
        count += 1
    }

    println(count)
}