package bfsdfs

import java.io.StreamTokenizer
import java.util.StringTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val br = System.`in`.bufferedReader()

    while(true){
        val (w, h) = br.readLine().split(" ").map { it.toInt() }
        if(w == 0 && h == 0){
            break
        }
        val graph = Array(h) { Array(w) { 0 } }
        val visited = Array(h) { BooleanArray(w) { false } }

        repeat(h) { x ->
            val st = StringTokenizer(readLine())
            repeat(w) { y ->
                graph[x][y] = st.nextToken().toInt()
            }
        }

        graph.forEach { println(it.toList()) }


    }
    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)
    fun dfs(x: Int, y: Int){

    }
}