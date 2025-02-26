package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val m = nextInt()

    val graph = Array(n+1) { mutableListOf<Int>() }
    repeat(m){
        val a = nextInt(); val b = nextInt()
        graph[b].add(a)
    }

    fun dfs(node: Int, visited: BooleanArray): Int {
        visited[node] = true
        var cnt = 1
        for(i in graph[node]){
            if(!visited[i]){
                cnt += dfs(i, visited)
            }
        }
        return cnt
    }

    val hackCnt = IntArray(n+1) { 0 }
    var maxCnt = 0

    for(i in 1..n){
        val visited = BooleanArray(n+1) { false }
        hackCnt[i] = dfs(i, visited)
        maxCnt = maxOf(maxCnt, hackCnt[i])
    }

    for(i in 1..n){
        if(hackCnt[i] == maxCnt){
            print("$i ")
        }
    }
}