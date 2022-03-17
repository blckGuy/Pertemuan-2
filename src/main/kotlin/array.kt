fun main(args: Array<String>) {
    //Array
    var arrA = arrayListOf<Int>()
    arrA +=34
    println(arrA[0])

    var arrB = arrayListOf<Int>()
    for (i in 1..10){
        arrB += i
    }

    for (i in arrB){
        print("$i")
    }
}