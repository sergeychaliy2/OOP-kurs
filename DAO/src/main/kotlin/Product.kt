import java.io.File

abstract class Products

data class Apple(private val nameProd: String = "Apple", private val info: String="apple very good"): Products()
data class Banana(private val name: String ="Banana", private val info: String="banana very old"): Products()


interface Dao{

    fun readProduct()
    fun writeProduct(prod: Products)
}
  class DaoProducts: Dao {
     private val path="text.txt"
     private val list= mutableListOf<String>()
     override fun readProduct()  {
         File("text.txt").useLines { lines -> lines.forEach { list.add(it) }}
         list.forEach { println(">  " + it) }
     }
     override fun writeProduct(prod: Products) {

         for prod.name in list:
         File(path).appendText(prod.name)
     }

 }


