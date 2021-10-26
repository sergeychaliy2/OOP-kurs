import java.io.File
import java.io.PrintWriter

interface Log{
    fun makeLoger(message: String)
}
class Factory{
     companion object{
    fun getLoger(loger: Int):Log{
        if(loger==1){
            val prod=SLog()
            return prod
        }
        else{
            val prod=FLog()
            return prod
        }
    }
  }
}

class FLog: Log{
    override fun makeLoger(message: String){
        File("log.txt").appendText("")
    }
}

class SLog:Log{
    override fun makeLoger(message: String){
       println(message)
