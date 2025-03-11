package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt(); val k = nextInt()
    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)
    var rnt = 0

    val graph = Array(n) { IntArray(m) { 0 } }

    repeat(k){
        val x = nextInt()-1; val y = nextInt()-1
        graph[x][y] = 1
    }

    fun dfs(x: Int, y: Int) : Int{
        var size = 1
        graph[x][y] = 0

        for(i in 0 ..< 4){
            val nx = dx[i] + x
            val ny = dy[i] + y

            if(nx in 0 ..< n && ny in 0 ..< m && graph[nx][ny] == 1){
                size += dfs(nx, ny)
            }
        }
        return size
    }

    repeat(n){x ->
        repeat(m){y ->
            if(graph[x][y] == 1){
                rnt = maxOf(rnt, dfs(x, y))
            }
        }
    }
    print(rnt)
}