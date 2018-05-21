
val myFnTrd = fun() {

}

val myFnLmd : (num :Int) -> Unit = { 
    println(it)
}

val myFnLmd1 : (num :Int, num1 : Int) -> Unit = { 
    num, num1 -> println(num)
}


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
    

    outerFn()()

    val otr :() -> Unit = outerFn() 
    otr()

    myFnLmd(10)

    myFn(
        fun( _ ) = true
    ) 
    myFn({
        true
    })

    myFn {
        true
    }
}


