
fun main(){


    val animal = Animal("Wanfadger");
    animal.think()
    val animal2 = Animal2(33)
    animal2.age()
}

//refers to the parethesis passed after the class name ,either using constructor keyword if the access modifier is
// to be specified explicitly or just () if the modifier is default
//the constructor key is optional if default access modifier is targeted
class Animal constructor(var name: String){
//var name: String = ""
    fun think(){
        println("All animals can think,  said ? $name")
    }
}

class Animal2(var age: Int){
    fun age(){
    println("my age $age")
    }
}