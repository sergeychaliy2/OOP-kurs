fun main() {
    val apple: Products = Apple("Apple", "red")
    val banana: Products = Banana("Banana", "yelow")
val list= mutableListOf<String>()
    val obj = DaoProducts()
obj.writeProduct(apple)
    obj.writeProduct(banana)
    obj.readProduct(list)
    println(list)

}