fun main(){
    //function expression: refers to functions that return values
 var result =    add(4,3) //returns a value stored in the result variable
  println(result)

    var maxumum = max(27,54)
    println("maximum of 27 and 54 is $maxumum")
}

//kt uses functional expression with the equal separating the body
fun add(num1 : Int , num2 : Int) : Int = num1+num2

fun max(num1: Int , num2: Int) : Int = if ((num1>num2)) num1 else num2