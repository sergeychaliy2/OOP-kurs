import java.io.File
import java.io.InputStream
abstract class Products{
    abstract val name: String
    abstract val info: String
}
data class Apple(override val name: String, override val info: String): Products()
data class Banana(override val name: String, override val info: String): Products()

interface Dao{

    fun readProduct(list: MutableList<String>)
    fun writeProduct(prod: Products)
}
 class DaoProducts: Dao {
     private val path="text.txt"
     override fun readProduct(list: MutableList<String>) {
         if(File(path).exists()){
             File(path).forEachLine  {
                 list.add(it)
             }
         }
     }

     override fun writeProduct(prod: Products) {
         File(path).bufferedWriter().use{out-> out.write("")}
         File(path).appendText("$prod\n")
     }

 }


