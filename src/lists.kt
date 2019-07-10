/*
There are two types of list in kotlin
--immutable and mutable list
immutableList(readOnly) are one whose elements are fixed when creating it, ie u cant add any element to it
mutableList(read and write)
 */


fun main(){
    var immutable  = listOf(2,3,4) //u can only read from this list
    //get second value
    println(immutable.get(1))

    println("printing immutable list elements")
    for (i in immutable){
        println(i)
    }


    println("printing immutable list elements")
    var names = mutableListOf<String>("fad" , "lei" , "kim")
    names.add("julie")

    for (i in names){
        println(i)
    }

}