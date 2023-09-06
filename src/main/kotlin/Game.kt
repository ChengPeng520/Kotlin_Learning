fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Scissors", "Paper")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""

    // 持續執行迴圈，直到使用者輸入有效的選擇
    while (!isValidChoice) {
        // 要求使用者輸入他們的選擇
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")

        // 讀取使用者輸入
        val userInput = readLine()?.capitalize()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        // 如果選擇是無效的，通知使用者
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String){
    val result: String

    // 判斷結果
    if (userChoice == gameChoice) result = "Tie!"
    else if (
        (userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Scissors" && gameChoice == "Paper") ||
        (userChoice == "Paper" && gameChoice == "Rock")
        ) result = "You win!"
    else result = "You lose!"

    // 印出結果
    println("You chose $userChoice. I chose $gameChoice. $result")
}