fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Scissors", "Paper")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]