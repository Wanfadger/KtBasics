
//secondary constructor is one declared inside the class, using a constructor keyword
//Note: whenever a on instance of a class is created the primary constructor is invoked

fun main(){
    var humman = Humman(22,"Fahad")
    humman.walk()
}


class Humman(var _name: String){
   var age: Int = 0
    var name: String= _name
    constructor(_age: Int , name: String) : this(name){
        this.age = _age
    }

    fun walk(){
        println("Most of the humans can walk eg $name : $age")
    }

}