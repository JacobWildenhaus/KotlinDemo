import java.util.*

/**
 * Basic example code
 * Jacob Wildenhaus
 * CSC-440 W2020
 */



fun main(args : Array<String>){

    var logList = arrayOf<String>()
    val length = logList.count()
    var power = "on"

do {
    print("What is your first name?")
    // Reading the user input
    val name = readLine()

    print("What is you last name?")
    // Reading the user input
    val lName = readLine()

    val user = "$name $lName"
    val logAppend = arrayOf(user)
    logList = logList.plus(logAppend)

    //If statement to check if I am the user
    if (name == "Jacob" && lName == "Wildenhaus") {
        println("Log in attempts: " + Arrays.toString(logList))
        println("\nWelcome back $name $lName")
        println("Are you finished?")
        val changeUser = readLine()

        if (changeUser == "no") {
            println("What would you like to do?")
            val next = readLine()
        }
        else{
            println("Goodbye.\n")
        }
    } else if(name == "Power" && lName == "Off"){
        println("\nPowering off")
        power = "off"
    }
    else
        println("\nYou're not the creator!\n")
}
while (power == "on")

}