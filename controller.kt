sealed class CommandProcessing {
    object ReturnModeList : CommandProcessing()
    object ReturnFirstItem : CommandProcessing()
}
    class Controller{
        private val model=Model()
        fun doAction(command:CommandProcessing):String{
        return when(command){
            is CommandProcessing.ReturnModeList->{
                model.getMutableList().toString()
            }
            is CommandProcessing.ReturnFirstItem->{
                model.getFirstElement()
            }
        }
    }
}