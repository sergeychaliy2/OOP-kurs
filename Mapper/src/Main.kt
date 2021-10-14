fun main(){
    val auto=Product(
        "Tesla",
        123,
        "Top",
        400,
        "auto")

    val catalogMapper:Mapper <Product,CatalogModel> =CatalogMapper()
    val priceMapper:Mapper <Product,PriceCatalog> =PriceMapper()
    val okMapper:Mapper <Product,OkModel> =OkMapper()
    println(catalogMapper.map(auto))
    println(priceMapper.map(auto))
    println(okMapper.map(auto))

}
