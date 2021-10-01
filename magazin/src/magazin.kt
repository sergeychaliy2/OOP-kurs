import java.io.File
interface Mag{
    fun MagazName():String

     fun KolVo() {
        println("no mame")
    }
    fun plusProduct(products: Products){
        println("no products")
    }
    fun minusProduct(products: Products){
        println("no products")
    }

}
class Katalog(private val magazname:String):Mag {
    val list = mutableListOf<Products>()
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
    }
     override fun minusProduct(products: Products) {
        list.remove(products)
         println(i)
         i -= 1
    }
}

abstract class Products(val price:Int ){
    abstract val product:String
    override fun toString():String{
        return "$product $price"
    }
}
class Drink(price:Int) : Products(price){
    override val product = "pepsi"
}
class Eat(price: Int):Products(price){
    override val product = "brad"
}
class Candies(price: Int):Products(price){
    override val product = "sweets"
}