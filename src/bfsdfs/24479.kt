package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val u = nextInt(); val m = nextInt(); val r = nextInt()
    val graph = Array(u+1) { mutableListOf<Int>() }
    val visited = IntArray(u+1) { 0 }
    var cnt = 1

    repeat(m){
        val a = nextInt(); val b = nextInt()
        graph[a].add(b)
        graph[b].add(a)
    }

    for(i in 1..u){
        graph[i].sort()
    }

    fun dfs(node: Int){
        visited[node] = cnt++
        for(i in graph[node]){
            if(visited[i] == 0){
                dfs(i)
            }
        }
    }

    dfs(r)
    for(i in 1..u){
        println(visited[i])
    }
}