
interface Human {
    fun thinks()
}

//the object keyword is used to create an instance of type Human and them implement it method
//the created instance is not reusable

    fun main(){
        val human = object : Human {
            override fun thinks() {
                println("my human is thinking")
            }
        }

        human.thinks()
    }
