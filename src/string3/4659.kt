package string3

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String { nextToken(); return sval }

    val sb = StringBuilder()
    val regex = run{
        /*
        ^: 문장의 처음
        $: 문장의 끝
        []: 안의 문자 아무거나
        [^]: 안의 문자만 아니면 된다!
        	-> [^aeiou] 자음
        + : 앞의 문자가 1개 이상
        결) 처음과 끝 사이에 자음만 1개 이상 == 문자열에 모음이 없다
        */
        val onlyConsonant = "^[^aeiou]+$"
        /*
        . : 아무 문자
        * : 0개 이상
        	-> .* 아무 문자나 0개 이상 존재
        {n,m} : 앞의 문자가 최소 n번 최대 m번
        결) 어떤 문자 사이에든, 자음/모음이 3번 이상 연속으로 존재
        */
        val threeConsonant = ".*[^aeiou]{3,}.*"
        val threeVowel = ".*[aeiou]{3,}.*"
        /*
        (): 캡쳐 그룹을 지정하고, 이후 \을 이용하여 값을 참조할 수 있다.
        \\: 앞의 \은 escape 문자로 뒤의 \이 참조를 위해 사용되었음을 알린다.
        결) [^eo]가 두번!
        */
        val repetitive = ".*([^eo])\\1.*"

        "${onlyConsonant}|${threeConsonant}|${threeVowel}|${repetitive}".toRegex()
    }
    while (true) {
        val str = nextString()
        if(str == "end") break
        sb.append('<').append(str)
        if(str.matches(regex)){
            sb.appendLine("> is not acceptable.")
        }else{
            sb.appendLine("> is acceptable.")
        }
    }
    print(sb)
}