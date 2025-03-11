package map

fun main() {
    val br = System.`in`.bufferedReader()
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    //이름이면
    val nameLib = HashMap<String, Int>()
    //숫자면
    val indexLib = Array(n+1) { "" }

    repeat(n){i ->
        val name = br.readLine()
        nameLib[name] = i+1
        indexLib[i+1] = name
    }

    val sb = StringBuilder()

    repeat(m){
        val problem = br.readLine()
        val answer = problem.toIntOrNull()?.let { indexLib[it] } ?: nameLib[problem]
        sb.appendLine(answer)
    }
    print(sb)
}