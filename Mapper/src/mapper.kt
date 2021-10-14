interface Mapper<I,O> {
    fun map(Input:I):O
}

class CatalogMapper: Mapper<Product,CatalogModel> {
    override fun map(input: Product): CatalogModel {
        val prod = CatalogModel(
            input.model,
            input.price,
            input.speed,
        )
        return prod
    }
}
class OkMapper:Mapper<Product,OkModel>{
    override fun map(input:Product):OkModel{
        val prod=OkModel(
            input.model,
            input.price,
            input.info,
            input.speed,
        )
        return prod
    }
}
class PriceMapper:Mapper<Product,PriceCatalog>{
    override fun map(input:Product): PriceCatalog {
        val prod=PriceCatalog(
            input.model,
            input.price,
            input.info,
            input.korobka)
        return prod
    }
}
