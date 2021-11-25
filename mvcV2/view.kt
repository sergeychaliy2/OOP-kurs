import java.util.*

enum class Enum{GETLIST,GETFIRST}
 interface View {
    fun commandTransaction(command: String) {
    }
}
class ViewS:View{
    private val controller:Controller=Controller()
    override fun commandTransaction(command:String){
        when(command.trim().uppercase(Locale.getDefault())){
            Enum.GETLIST.name->{
                println(controller.doAction(CommandProcessing.ReturnModeList))
            }
            Enum.GETFIRST.name->{
                println(controller.doAction(CommandProcessing.ReturnFirstItem))
            }
        }
    }

}