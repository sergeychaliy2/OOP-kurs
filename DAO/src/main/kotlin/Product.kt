import java.io.File
import java.io.InputStream
abstract class Products{
    abstract val _info: String
    abstract val name: String
}
data class Apple(override val name: String ="Apple", override val _info: String): Products()
data class Banana(override val name: String ="Banana", override val _info: String): Products()

interface Dao{

    fun readProduct():MutableList<String>
    fun writeProduct(prod: Products)
}
 class DaoProducts: Dao {
     private val path="text.txt"
     private val list= mutableListOf<String>()
     override fun readProduct(): MutableList<String> {
         if(File(path).exists()){
            val obj= File(path).readText()
          list.add(obj)
         }
         return list
     }
     override fun writeProduct(prod: Products) {
         File(path).appendText("$prod\n")
     }

 }


