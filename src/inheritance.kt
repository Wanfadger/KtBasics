
//unlike in java , classes and methods in kt are final by default
//meaning that inorder to inherit from any class it should be explicitly specified using "open" keyword
//to override a method use the "override" keyword when defining it
//Note: while inheriting the primary constructor must be called and the multiple inheritance is not allowed

//in java to set the parents constructor we the super keyword but in kotlin the constructor is auto invoked and the
//constructor variables are set to the right
//the init block represents the primary constructor block
open class Person(age: Int){

    init {
        println("prson's age $age")
    }

    //making it open allows it to be override
  open  fun thinks(){
        println("all animals can think")
    }
}

//inheriting from tclass Person
class Manager (name: String , age: Int ): Person(age){
    init {
        println("manager's name $name and age $age")
    }
    //override paent method
   override fun thinks(){
        println("This animal is a manager")
    }
}


fun main(){
    var person  = Manager("Howard" , 30)
    person.thinks()
}