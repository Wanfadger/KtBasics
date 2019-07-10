//data class is a normal class with merit of default
//-toString()
//-equals $ hashcode
//-copy

data class Laptop(var name: String , var price: Int)

fun main(){
    val laptop = Laptop("DELL" , 2000)
    val laptop2 = Laptop("DELL" , 2000)
    //printing object structure
    println(laptop)

    //copying laptop into 3
    val laptop3  = laptop.copy()
    println("laptop3 $laptop3 ")
    //copying laptop into 4 with different price
    val laptop4  = laptop.copy(price=4000)

    println("laptop4 $laptop4")

    //comparing both objects
    println("is lap1==lap2:= ${laptop.equals(laptop2)}")
}
