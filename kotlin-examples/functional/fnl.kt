
val asnFn: () -> Unit = fun() {
 // functions can be assigned to variables
}

fun myFn( prm: ( num : Int) -> Boolean ) {
    println("value is returning ${prm(10)}")

    // functions can be passed as parameters
}

fun outerFn(): () -> Unit {
    return fun() {
        println("Outer function is returning a function")
    }

    // function is returning another function
}

fun main(args: Array<String>) {
    myFn(
        fun( _ ) = true
    )  

    outerFn()()

    val otr :() -> Unit = outerFn() 
    otr()
}


