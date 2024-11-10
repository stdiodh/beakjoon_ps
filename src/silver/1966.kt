package silver

import java.io.StreamTokenizer
import java.util.LinkedList
import java.util.Queue

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val r = nextInt()
    repeat(r) {
        val n = nextInt(); val m = nextInt()
        val queue: Queue<IntArray> = LinkedList()

        repeat(n) {
            queue.add(intArrayOf(it, nextInt()))
        }

        fun find(arr : Queue<IntArray>, target: Int) : Boolean{
            if (arr.isEmpty()) { return false }
            for(x in queue){
                if(x[1] > target){
                    return true
                }
            }
            return false
        }

        var cnt = 1
        while (!queue.isEmpty()){
            val data = queue.remove()

            if(find(queue, data[1])){
                queue.add(data)
                continue
            }

            if(data[0] == m){
                println(cnt)
                break
            } else {
                cnt++
            }
        }
    }
}

/**
 * fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {
 *     fun nextInt() : Int {nextToken(); return nval.toInt() }
 *     fun findOver(arr : LinkedList<Pair<Int, Int>>, t : Int) : Boolean {
 *         if (arr.isEmpty()) {return false}
 *         for (p in arr) {
 *             if (p.first > t) {return true}
 *         }
 *         return false
 *     }
 *     val sb = StringBuilder()
 *     repeat(nextInt()) {
 *         val n = nextInt(); val m = nextInt()
 *         val queue = LinkedList<Pair<Int, Int>>()
 *         repeat(n) {
 *             queue.add(Pair(nextInt(), it))
 *         }
 *         var cnt = 1
 *         while (!queue.isEmpty()) {
 *             val curr = queue.removeFirst()
 *             if (findOver(queue, curr.first)) {
 *                 queue.add(curr)
 *                 continue
 *             }
 *
 *             if (curr.second == m) {
 *                 sb.appendLine(cnt)
 *                 break
 *             } else { cnt += 1 }
 *         }
 *     }
 *     print(sb)
 * }
*/