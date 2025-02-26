package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val br = System.`in`.bufferedReader()
    val dx = intArrayOf(0, 1, 0, -1, -1, 1, -1, 1)
    val dy = intArrayOf(1, 0, -1, 0, -1, 1, 1, -1)

    while(true){
        val w = nextInt(); val h = nextInt()
        if(w == 0 && h == 0){
            break
        }
        val graph = Array(h) { Array(w) { nextInt() } }
        val visited = Array(h) { BooleanArray(w) { false } }

        fun dfs(x: Int, y: Int){
            visited[x][y] = true

            for(i in 0..< 8){
                val nx = dx[i] + x
                val ny = dy[i] + y

                if(nx < 0 || nx >= h || ny < 0 || ny >= w){
                    continue
                }
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    dfs(nx, ny)
                }
            }
        }

        var ans = 0
        repeat(h){x ->
            repeat(w){y ->
                if(graph[x][y] == 1 && !visited[x][y]){
                    ans++
                    dfs(x, y)
                }
            }
        }
        println(ans)
    }
}