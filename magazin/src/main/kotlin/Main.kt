fun main(args: Array<String>) {
    val shop = Catalog("loyal")
    val drink:Products = Drink()
    val eat:Products = Eat(19)
    Candies(20)
    shop.plusProduct(drink)
    shop.plusProduct(eat)
    shop.number()
}
