/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

val nm = "android"
var ag = 41
val sl : Int = 45
var dt : Any = 89

val fnVr : () -> String = fun () : String {
    return "android"
}

fun simple() : Unit {
    ag = 45
    println(nm)
}

fun arrayEx() {
    val arr = arrayOf("Android", "Apple", "Samsung", "HTC")
}


fun inFn() = println("your age is $ag")

fun parmsFn( bl : Boolean) = println("Value is $bl") 

fun main( args : Array<String>) {
    val smObj = object {
        var dt = 10
        val tm = 52
    
    	fun hello() {
        	dt = 56
    	}
	}
    simple()
    inFn()
    parmsFn(true)
    println("Function is returning ${fnVr()}")
    println("""
    	${smObj.dt}
        """)
}