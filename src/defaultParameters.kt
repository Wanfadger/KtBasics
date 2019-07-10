fun main(){
//default parameter: refres to a paramter whose value is defined within the function  parathesis on its declaration
    //unlike overloaded function in java kt uses default parameter
    var finalAmount = calcAmount(1000)
    println(finalAmount)
}


fun calcAmount(amount: Int , interest: Double = 0.04): Int = (amount + (amount*0.004)).toInt()