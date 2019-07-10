
fun main(){
    //creates a list o fnames
  var names = listOf("Galiwango" , "fahad" , "fanny")

    println("LOOPING THROUGH A LIST")
    for (it in names){
        println(it) //i resolves to value in the list in order
    }

    println("GETTING VALUES AND INDECIES")
   //We use a principle of destructuring
    for ((index , value) in names.withIndex()){
        println("index: $index   : value :$value")
    }


}