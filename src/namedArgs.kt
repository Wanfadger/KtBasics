fun main(){
//named parameter/arg: refres to an argumnet passed with its name when the method is invoked
//named parameter imporves code readability
    var finalAmount = calcAmount2(amount = 1000 , interest = 0.03)
    println(finalAmount)
}


fun calcAmount2(amount: Int , interest: Double = 0.04): Int = (amount + (amount*interest)).toInt()