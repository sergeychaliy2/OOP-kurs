import java.io.File
import java.io.PrintWriter

Class Product{
    fun getLoger(loger:Int):Interface{
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

class FLog:Interface{
    override fun makeLoger(message:String){
        File("log.txt").appendText("")
    }
}

class SLog:Interface{
    override fun makeLoger(message:String){
       println(message)

interface:Interface{
    fun makeLoger(message:String)
}