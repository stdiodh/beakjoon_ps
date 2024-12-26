package string3

fun main(){
    val (a, b) = readln().split(" ")

    print(
        a.fold(0L) { t, n ->
            t + b.sumOf { (n.code.toLong() - 48L) * (it.code.toLong() - 48L) }
        }.toBigInteger()
    )
}