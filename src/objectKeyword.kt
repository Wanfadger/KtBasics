
//object keyword is used to single instance of a class hence singleton pattern

data class Book(var name: String ,var price: Int )

object BookShelf{
    var books = ArrayList<Book>()

    fun showBooks(){
        for ((key , value) in books.withIndex() ){
            println("$key -> $value")
        }
    }
}


fun main(){
    BookShelf.books.add(Book("Java" , 40))
    BookShelf.books.add(Book("Kotlin" , 100))
    BookShelf.books.add(Book("SQL" , 50))
    BookShelf.books.add(Book("Angular" , 60))

    BookShelf.showBooks()
}