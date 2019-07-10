
//companion objects give java developer a feel of static keyword
//Note:companion methods/objects are not static by default in java, annotate with @JvmStatic to make it static in java

class G{
    companion object{
        @JvmStatic
        fun show(){
            println("am using companion usage in kotlin")
        }
    }
}

fun main(){
    G.show()
}