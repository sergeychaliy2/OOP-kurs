fun main(){
    val auto=Product("Tesla", 123, "Top", 400,

    val catalogMapper:Mapper<Product,CatalogModel>=CatalogMapper()
    val detailsMapper:Mapper<Product,PriceModel>=DetailsMapper()
    val specialMapper:Mapper<Product,CatalogModel>=PriceMapper()
    println(CatalogMapper.map(auto))
    println(DetailsMapper.map(auto))
     println(PriceMapper.map(auto))
    
}
