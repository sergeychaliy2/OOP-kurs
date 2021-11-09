fun main() {
    val apple: Products = Json.encodeToString(Apple( info = "apple very good")
    val banana: Products =Json.encodeToString(Banana(info="banana very good")
    val obj = DaoProducts()
obj.writeProduct(apple)
    obj.writeProduct(banana)
    obj.readProduct()


}
