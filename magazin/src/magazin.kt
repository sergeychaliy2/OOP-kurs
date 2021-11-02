import java.io.File
interface Shop{
    fun ShopName():String
    fun Number()
    fun plusProduct(products: Products)
    fun minusProduct(products: Products)
}
class Catalog(private val shop_name:String):Shop {
     private val list = mutableListOf<Products>()
    override fun ShopName():String {
        return shop_name
    }
   override fun Number(){
       println(list.size)
       toString()
    }
     override fun plusProduct(products: Products) {
        list.add(products)

    }
     override fun minusProduct(products: Products) {
        list.remove(products)

    }
}

abstract class Products(private val price:Int ){
    abstract val product:String
    open fun alhog() {}
    override fun toString():String{
        return "$product $price"
    }
}
class Drink(price:Int, private val norm:Float, private val dose: Float) : Products(price){
    override val product = "pepsi"
    override fun alhog() {
        if (norm<dose){
            println("poorly")

        }else{
            println("good")
        }
    }
}
class Eat(price: Int):Products(price){
    override val product = "brad"
}
class Candies(price: Int):Products(price){
    override val product = "sweets"
}

