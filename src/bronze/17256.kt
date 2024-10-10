package bronze

fun main() {
    val (ax, ay, az) = readln().split(" ").map { it.toInt() }
    val (cx, cy, cz) = readln().split(" ").map { it.toInt() }
    val x = cx-az
    val y = cy/ay
    val z = cz-ax

    println("$x $y $z")
}