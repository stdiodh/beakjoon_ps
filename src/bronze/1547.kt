package bronze

fun main() {
    var ballArray = mutableListOf(1, 0, 0)

    repeat(readln().toInt()){
        val (n, m) = readln().split(" ").map { it.toInt() }
        val nNum = ballArray[n-1]
        ballArray[n-1] = ballArray[m-1]
        ballArray[m-1] = nNum
    }

    for(x in ballArray.indices){
        if(ballArray[x] == 1){
            println(x+1)
        }
    }
}