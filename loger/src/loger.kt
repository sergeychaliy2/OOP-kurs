import java.io.File
import java.io.PrintWriter

interface MyInterface{
    fun makeLoger(message: String)
}
Class Product{
     companion object{
    fun getLoger(loger: Int):MyInterface{
        if(loger<=3){
            val prod=FLog()
            return prod
        }
        else{
            val prod=SLog()
            return prod
        }
    }
  }
}

class FLog: MyInterface{
    override fun makeLoger(message: String){
        File("log.txt").appendText("")
    }
}

class SLog:MyInterface{
    override fun makeLoger(message: String){
       println(message)
