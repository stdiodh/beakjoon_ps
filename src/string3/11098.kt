package string3

fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuilder()

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val players = mutableListOf<Pair<Int, String>>()

        repeat(n) {
            val (price, name) = br.readLine().split(" ")
            players.add(Pair(price.toInt(), name))
        }

        val mostExpensivePlayer = players.maxByOrNull { it.first }
        sb.appendLine(mostExpensivePlayer?.second)
    }

    print(sb.toString())
}