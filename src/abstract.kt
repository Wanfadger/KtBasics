
//Abstract classes are classes that cannot tbe instantiated, ie cannot create their objects
//All methods in the abstract class must be defined, ie have a body
///incase u dont want to implement it, declared it abstract and any class inheriting from it must implement it
//and its open by default
//Also abstract class are open by default

abstract class A{

    abstract fun myLetter()

    open fun letter(){
        println("am letter A")
    }
}

class B : A(){

    override fun letter(){
        println("Am letter B")
    }

    //implementing the abstract method
    override fun myLetter(){
        println("My parents letter is A")
    }
}

fun main(){
    var b = B()
    b.letter()
    b.myLetter()

}