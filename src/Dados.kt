import kotlin.random.Random

fun main() {
    val dado1 = Dado(1,3)
    val dado2 = Dado(4,6)
    val dado3 = Dado()
    val Jugadores = List(100) {Jugador()}
    var cont = 0

    for(cont in 0..99){

        Jugadores[cont].id=cont+1

        println(Jugadores[cont].id)

    }






}




class Dado {
    private var numMin = 1
    private var numMax = 6

    constructor() {

    }

    constructor(numMin: Int, numMax: Int) {
        this.numMin = numMin
        this.numMax = numMax
    }


    fun darValores(valMin: Int, valMax: Int) {
        if (valMin <= valMax) {
            numMax = valMax
            numMin = valMin
        } else {
            println("Se han cambiado los valores min y maximo")
            numMax = valMin
            numMin = valMax
        }
    }

    fun tiradaUnica(): Int {
        return Random.nextInt(numMin, numMax)
    }

    fun tiradaDoble(): Int {
        val num1 = Random.nextInt(numMin, numMax)
        println("num1 = $num1")
        val num2 = Random.nextInt(numMin, numMax)
        println("num2 = $num2")
        return if (num1 == num2) num1 * num2 else num1 + num2
    }


}


class Jugador{
     var id = 0
     var puntos=0



}