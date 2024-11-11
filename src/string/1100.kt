package string

fun main() {

    val board = Array(8) {
        readln()
    }

    var cnt = 0
    for(x in 0..<8){
        if(x % 2 == 0){
            for(y in 0..<8 step 2){
                if(board[x][y] == 'F'){
                    cnt++
                }
            }
        } else {
            for(y in 1..<8 step 2){
                if(board[x][y] == 'F'){
                    cnt++
                }
            }
        }
    }
    println(cnt)
}