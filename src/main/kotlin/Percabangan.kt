fun main(args: Array<String>) {
//Conditions
    if (15 > 5)
        println("True")
    println("The program continues here...")

//If - Else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " + max)
//If - else if
    var myVar: Int = 0 // variabel disamping di inisiaslisasi dengan nilai 0
    if (myVar == 0) { // jika nilai nya 0 kita rubah nilainya menjadi 1
        myVar = 1
    } else if(myVar == 1){ // jika nilai nya 1 kita rubah nilainya menjadi 0
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)
    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("The number you entered is greater than 5!")
    println("Thanks for the input!")
}