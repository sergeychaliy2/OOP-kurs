class Model{
    private val list= mutableListOf("Alex","Sergey")
    fun getFirstElement():String{
        return list.elementAt(list.size-1)
    }
    fun getMutableList():MutableList<String>{
        return list
    }
}