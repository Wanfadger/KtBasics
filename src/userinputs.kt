import java.util.*

//There are two way o fallowing user inputs in kotlin
//-using the Scanner object just as it is in java
//using readLine() , its the kotlin and recomended way of reading inputs


fun main() {
    var scanner = Scanner(System.`in`)
    var num1 = scanner.nextInt()
    println("Enter number to print using scanner object")
    println("u typed $num1")
    println("Enter String to pring using readLine() ")
    var name = readLine()
    println()
    println("my name is $name")
}