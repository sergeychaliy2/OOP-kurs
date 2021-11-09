import java.io.File

interface Log{
    fun makeLoger(message: String)
}
class FLog: Log{
    override fun makeLoger(message: String){
        File("log.txt").appendText(message)
    }
}

class SLog :Log {
    override fun makeLoger(message: String) {
        println(message)
    }
}
enum class LoggerType {
    CONSOLE_LOGGER,
    TEXTFILE_LOGGER
}
class Factory {
    fun getLogger(type: LoggerType) {
        return with (type) {
            LoggerType.CONSOLE_LOGGER ->SLog()
            LoggerType.TEXTFILE_LOGGER ->FLog()
        }
    }
}
