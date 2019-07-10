
//Asumming we have a class that needs alot o fthings to be injected during its instantion, the challenge comes when you
//need its object for multiple use, the best way is t ouse FACTORY PATTERN wic is implemented using companion object in java

class H{

    companion object {
        //this methods returns an instance of the class, so need of creating the instance again
        fun getInstance(): H = H()
    }


    fun show (){
        println("am broadcasting from H ")
    }
}


fun main() {
    println(H.getInstance().show())
}