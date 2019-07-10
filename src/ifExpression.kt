fun main(){
    var age  = 20
    println("IF USED AS AN EXPRESSION")
    //"if" statement is used as an expression in kotlin that returns the last line if a block has more than one
    var result = if ((age>18 || age==18)) {
        "your eligible to vote"
        2
    }else{
        "your not eligible to vote"
    }

    println(result)


    println("IF USED AS A STATEMENT ")



     if ((age>18 || age==18)) {
         println("your eligible to vote")
    }else{
        println("your not eligible to vote")
    }

}