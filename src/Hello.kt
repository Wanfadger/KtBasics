
fun main(args: Array<String>){
    println("Hello world , am a kotlin developer")

    //we dont use the new keyword to create an instance of a class
    //class properties are accessed using a dot

    var alien = Alien()
    alien.name = "Galiwango Fahad"

    println(message = "my name is ${alien.name}")

    val alien2 = Alien()
    alien2.name="Wanafadger"
    println(message = "developer name is ${alien2.name}")


}