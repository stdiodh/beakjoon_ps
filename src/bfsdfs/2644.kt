package bfsdfs

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt();
    val x = nextInt(); val y = nextInt()
    val graph = Array(n+1) { mutableListOf<Int>() }
    val visited = BooleanArray(n+1){ false }

    val m = nextInt()
    repeat(m){
        val a = nextInt(); val b = nextInt()
        graph[a].add(b)
        graph[b].add(a)
    }

    fun dfs(node : Int, depth: Int) : Int {
        if(node == y){
            return depth
        }
        visited[node] = true
        for(i in graph[node]){
            if(!visited[i]){
                val result = dfs(i, depth+1)
                if(result != -1) return result
            }
        }
        return -1
    }

    val ans = dfs(x, 0)
    print(ans)
}