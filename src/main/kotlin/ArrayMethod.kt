fun main(args: Array<String>) {
    val simpsonsA = arrayOf("Dani", "Zizi", "Dicky", "Agoong")
    simpsonsA.sort()
    for (simpson in simpsonsA){
        print(simpson + ' ')
    }
    print('\n')

    //pengurutan data
    val simpsonsB: Array<String> = arrayOf("Dani", "Zizi", "Dicky", "Agoong")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted){
        print('\n')
    }

    //reverse() and reversedArray()
    val simpsonsC: Array<String> = arrayOf("Dani", "Zizi", "Dicky", "Agoong")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')
//indexOf()
    val simpsonsD = arrayOf("Dani", "Zizi", "Dicky", "Agoong")
    val simpson = "Dani"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }
    val simpsonsE = arrayOf("Dani", "Zizi", "Dicky", "Agoong")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.minOrNull())
    println("Max = "+ simpsonsE.maxOrNull())
    println("First = " + simpsonsE.first())
    println("Last = " + simpsonsE.last())

}