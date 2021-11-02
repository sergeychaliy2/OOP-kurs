fun main() {
    val apple: Products = Apple( _info = "green")
    val banana: Products = Banana(_info="yellow")
    val obj = DaoProducts()
obj.writeProduct(apple)
    obj.writeProduct(banana)
    obj.readProduct()


}
