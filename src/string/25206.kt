package string

fun main() {
    fun getScore(rating: String): Double {
        return when (rating) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            else -> 0.0
        }
    }
    //학점 * 과목평점
    var total = 0.0
    //학점 총합
    var gdSum = 0.0

    for (x in 0..<20) {
        //과목, 학점, 등급
        val input = readln().split(" ")
        val g = input[1].toDouble()
        val r = input[2]
        val score = getScore(r)

        if (r == "P") {
            continue
        }

        total += g * score
        gdSum += g
    }
    println("%.6f".format(total / gdSum))
}
