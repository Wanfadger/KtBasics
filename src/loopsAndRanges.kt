
fun main(){
    //i nkt we use ranges siginified by the '..' range operator

    ///looping through values from 1 to 5
    var range = 1..7
    for(a in range){
        println(a)
    }

    println("RANGE METHODS")
    println()
    println("LastElement in the range:   ${range.endInclusive}")
    println("Counting elements in the range :   ${range.endInclusive}")
    println("Checking if range contains any specified value ${range.contains(4)}")

    //looping through values excluding the maximum value in the range, using until keyword
    println("EXCLUDING THE MAXIMUM VALUE FROM THE RANGE")

    for(a in 1 until 8){
        println(a)
    }

   //to define the interval of iteration , use the step worr

    println("LOOPING WITH STEP")
    for(a in 1..10 step 2){
        println(a)
    }

    //the downTo method is invoked instead of the '..'
    println("REVERSING ELEMENTS IN THE RANGE")

    var reversedrange  = 10.downTo(3) // or 10 downTo 18


    for(a in reversedrange){
        println(a)
    }


    println("REVERSING USING reversed method invoked on a range")
    for(a in range.reversed() step 3){
        println(a)
    }



}