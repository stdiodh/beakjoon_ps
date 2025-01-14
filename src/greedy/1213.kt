package greedy

/*
fun main() {
    val br = System.`in`.bufferedReader()
    val name = br.readLine().toCharArray().sorted() // 입력받아 정렬
    val freq = mutableMapOf<Char, Int>()

    // 문자 빈도 세기
    for (char in name) {
        freq[char] = freq.getOrDefault(char, 0) + 1
    }

    var oddCount = 0
    var oddChar: Char? = null

    // 홀수 빈도 확인
    for ((char, count) in freq) {
        if (count % 2 == 1) {
            oddCount++
            oddChar = char
        }
    }

    // 홀수 개 문자가 2개 이상이면 팰린드롬 불가능
    if (oddCount > 1) {
        println("I'm Sorry Hansoo")
        return
    }

    // 사전 순으로 절반 문자열 구성
    val half = StringBuilder()
    for ((char, count) in freq.toSortedMap()) {
        repeat(count / 2) {
            half.append(char)
        }
    }

    // 최종 팰린드롬 생성
    val result = if (oddChar != null) {
        half.toString() + oddChar + half.reversed().toString()
    } else {
        half.toString() + half.reversed().toString()
    }

    print(result)
}
 */

fun main() {
    val br = System.`in`.bufferedReader()
    val str = br.readLine()
    val alphabetCount = IntArray(26)

    for (element in str) {
        alphabetCount[element - 'A']++
    }

    var oddCount = 0
    var oddChar = ' '
    val halfPalindrome = StringBuilder()

    for (i in 0 .. 25) {
        if (alphabetCount[i] % 2 != 0) {
            oddCount++
            oddChar = (i + 'A'.code).toChar()
        }
        repeat(alphabetCount[i] / 2) {
            halfPalindrome.append((i + 'A'.code).toChar())
        }
    }

    if (oddCount > 1) {
        print("I'm Sorry Hansoo")
    } else {
        val result = halfPalindrome.toString() +
                (if (oddCount == 1) oddChar else "") +
                halfPalindrome.reverse()
        print(result)
    }
}