package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    repeat(nextInt()){
        val dx = intArrayOf(1, 0, -1, 0)
        val dy = intArrayOf(0, 1, 0, -1)
        val m = nextInt(); val n = nextInt(); val k = nextInt()
        val graph = Array(n) { Array(m) { 0 } }
        val visited = Array(n) { BooleanArray(m) { false } }

        repeat(k){
            val a = nextInt(); val b = nextInt()
            graph[b][a] = 1
        }

        fun dfs(x : Int, y : Int){
            graph[x][y] = 0
            visited[x][y] = true

            for(i in 0..< 4){
                val nx = dx[i] + x
                val ny = dy[i] + y

                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue
                }
                if(!visited[nx][ny] && graph[nx][ny] == 1)
                {
                    dfs(nx, ny)
                }
            }
        }

        var cnt = 0
        repeat(n){x ->
            repeat(m){y ->
                if(graph[x][y] == 1 && !visited[x][y]){
                    cnt++
                    dfs(x,y)
                }
            }
        }
        println(cnt)
    }
}