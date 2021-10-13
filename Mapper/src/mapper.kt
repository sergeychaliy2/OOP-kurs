interface Mapper<I,O> {
    fun map(Input:I):O
}

class CatalogMapper: Mapper<Product,CatalogModel> {
    override fun map(input: Product): CatalogModel {
        val car = CatalogModel(
            input.model,
            input.price,
            input.speed
        )
        return car
    }
}
class DetailsMapper:Mapper<Product,PriceModel>{
    override fun map(input:Product):PriceModel{
        val car=PriceModel(
            input.model,
            input.price,
            input.info,
            input.speed
        )
        return car
    }
}
class PriceMapper:Mapper<Product,PriceCatalog>{
    override fun map(input:Product): PriceCatalog {
        val car=PriceCatalog(
            input.model,
            input.price,
            input.info,
        )
        return car
    }
}