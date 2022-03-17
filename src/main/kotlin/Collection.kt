fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
fun main(args: Array<String>) {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}
//collection digunakan unutk menyimpan kelompok data yang berada dalam memori,
// dalam collection kita bisa mengambil, menyimpan dan juga mengatur.