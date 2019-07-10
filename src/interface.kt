
///interfaces refers to class prints that cant be instantiated
//interface and its methods are open by default
//from java8+ , interface supports default methods and method declaration
//Any class implementing the interface must implement all its declared methods
//its a way of implementing multiple inheritance in kt and java
//Note: if  class implements multiple interfaces having similar default method , the implementing class
//must either declared the same function or override the interface method and as well specify which interface's method
//should be invoked using a generic super keyword


interface D{
    fun display()

    fun def(){
        println("This is my class-interfaces method in D")
    }
}

interface E{
    fun show()
    fun def(){
        println("This is my class-interfaces method in E")
    }
}

class F: D,E{
    override fun display() {
        println("displaying from D")
    }

    override fun show() {
        println("displaying from E")
    }

    override fun def(){
        super<D>.def()
        super<E>.def()
        //println("This is my class-interfaces method in F")
    }
}

fun main(){
    var f = F()
    f.display()
    f.show()
    f.def()
}