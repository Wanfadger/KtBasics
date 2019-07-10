
fun  main(){
    val  num : Int = 2

    //unlike switch statement in java, kt uses when statement wic can also be used as an expression
    //when as a statement
    when (num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        else -> println("use proper input")
    }

    //when as an expression
    var result : String = when(num){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "use proper input"
    }

    println("result from an when expression $result")
}