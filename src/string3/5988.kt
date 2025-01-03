package string3

fun main()  {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    repeat(br.readLine().toInt()){
        bw.write(if (br.readLine().last().digitToInt() % 2 == 0) "even\n" else "odd\n")
    }
    bw.flush()
    br.close()
    bw.close()
}