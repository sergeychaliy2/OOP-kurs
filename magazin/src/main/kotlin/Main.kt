fun main(args: Array<String>) {
    val magazins = Katalog("Verniy")
    val drink:Products = Drink(5)
    val eat:Products = Eat(19)
    val candies:Products = Candies(20)
    magazins.plusProduct(drink)
    magazins.plusProduct(eat)
    magazins.plusProduct(candies)
    magazins.KolVo()
    magazins.minusProduct(candies)
    magazins.KolVo()
    println(eat.price)
    println(drink.price)

}