import java.util.Date

open class Car(
    private var spd : Int = 10,
    private val dt :  Date = Date()
) {
    fun speedUp( dlt : Int? = 5, alp : Double? = 5.6 ) { 
        spd += 5
        println("Speed is $spd")
    }  
}

class Bmw(
    private var nos : Boolean = false,
    private var cc : String = "dynamic"
) : Car(), GpsListener  {

    override fun location() {

    }
}

interface GpsListener {
    fun location()    
}

class FourWheeler {
    var rad : Int = 5
    constructor() {
        rad = 5
    }
}

fun main(args: Array<String>) {
    val cr = Car()
    cr.speedUp()
    cr.speedUp( a )

    var fw = FourWheeler()

    val gps = object : GpsListener {
        override fun location() {

        }
    }
}