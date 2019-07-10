
//passing a method as an srgment to a method
fun main() {
    var immutable  = listOf(2,3,4) //u can only read from this list
    //get second value
    println(immutable.get(1))

    println("printing immutable list elements")
//immutable.forEach({ p -> println(p)})
    immutable.forEach(::println)
}
