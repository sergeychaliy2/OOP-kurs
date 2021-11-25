fun main() {
    val view = ViewS()
    while (true) {
        println("GETLIST or GETFIRST")
        val entered: String = readLine().toString()
        view.commandTransaction(entered)
    }
}