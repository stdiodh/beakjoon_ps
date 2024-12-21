package bfsdfs

import java.io.StreamTokenizer
import kotlin.system.exitProcess

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    var graph = Array(n) { IntArray(n) { nextInt() } }
    var visited = Array(n) { Array(n) { false } }

    fun dfs(x:Int, y:Int){
        if(x == n-1 && y == n-1){
            print("HaruHaru")
            exitProcess(0)
        }

        val nx = arrayOf(x, x+graph[x][y])
        val ny = arrayOf(y+graph[x][y], y)

        for(i in 0 until 2){
            if(nx[i] !in 0 until n || ny[i] !in 0 until n || visited[nx[i]][ny[i]]) continue
            visited[nx[i]][ny[i]] = true
            dfs(nx[i], ny[i])
        }
    }

    visited[0][0] = true
    dfs(0,0)

    print("Hing")
}