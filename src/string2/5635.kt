package string2

import java.io.StreamTokenizer

data class Student(val name:String, val dd:Int, val mm:Int, val yyyy:Int)

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val n = nextInt()
    val student = Array(n){ Student(nextString(), nextInt(), nextInt(), nextInt()) }
    student.sortWith(compareByDescending(Student::yyyy).thenByDescending(Student::mm).thenByDescending(Student::dd))
    println(student[0].name)
    print(student[n-1].name)
}