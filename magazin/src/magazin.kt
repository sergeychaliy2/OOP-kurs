import java.io.File
import java.io.PrintWriter

class Katalog(private val magazname:String){
   private val list = mutableListOf<Products>()
    var i:Int = 0
    override fun MagazName():String {
        return "${magazname}"
    }
   override fun KolVo(){
       println(i)
       toString()
    }
     override fun plusProduct(products: Products) {
        list.add(products)
         println(i)
         i += 1
         File("product.txt").appendText("\$products")
    }
     override fun minusProduct(products: Products) {
        list.remove(products)
         println(i)
         i -= 1
      
    }
}

abstract class Products(val price:Int ){
    abstract val alh:double
    open fun alhog(norma: Float, alh: Float) {
        if (norma<alh){
            println("error")

        }else{
            println("OK")
        }
    }
    abstract val product:String
    override fun toString():String{
        return "$product $price"
    }
}
class Drink(price:Int,norma:Float,alh: Float) : Products(price){
    override val product = "pepsi"
    override fun alhog(norma: Float, alh: Float) {
        super.alhog(norma, alh)
    }
}
class Eat(price: Int):Products(price){
    override val product = "brad"
}
class Candies(price: Int):Products(price){
    override val product = "sweets"
}
