fun main() {
    val apple: Products = Json.encodeToString(Apple())
    val banana: Products =Json.encodeToString(Banana())
    val obj = DaoProducts()
obj.writeProduct(apple)
    obj.writeProduct(banana)
    obj.readProduct()


}
