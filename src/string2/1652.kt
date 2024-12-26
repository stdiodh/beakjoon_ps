package string2

fun main() {
    //1. 입력받기
    val n = readln().toInt()
    val room = Array(n) { readln() }
    val map = Array(n) { BooleanArray(n) { true } }

    repeat(n){x ->
        repeat(n){y ->
            if(room[x][y] == 'X'){
                map[x][y] = false
            }
        }
    }

    //2. 방 확인
    var ansR = 0
    var ansC = 0

    for(x in 0 ..< n){
        var r = 0
        var c = 0
        for(y in 0..< n){
            //2-1. 가로 확인
            if(map[x][y]){
                r++
                if(r == 2){
                    ansR++
                }
            } else {
                r = 0
            }
            //2-2. 세로 확인
            if(map[y][x]){
                c++
                if(c == 2){
                    ansC++
                }
            } else {
                c = 0
            }
        }
    }
    print("$ansR $ansC")
}