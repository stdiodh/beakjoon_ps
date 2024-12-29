package string3

import java.io.*

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(br.readLine().toInt()){
        val pwd = br.readLine()
        if(pwd.length in 6..9){
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }
    bw.flush()
    br.close()
    bw.close()
}