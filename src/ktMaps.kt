import java.util.*

fun main(){
    var person = TreeMap<String , String>()
    person["name"] = "Galiwango"
    person["title"] = "developer"

    for( (key , value) in person){
        println("key $key : value $value")
    }
}