import kotlin.random.Random

fun main() {
    val dado1 = Dado(1,3)
    val dado2 = Dado(4,6)
    val dado3 = Dado()
    val Jugadores = List(100) {Jugador()}
    var cont = 0

    for(cont in 0..99){

        Jugadores[cont].id=cont+1

    }

        for (cont in 0..99){
            for(cont2 in 0..99){
                Jugadores[cont].puntos = Jugadores[cont].puntos + dado1.tiradaUnica();
                Jugadores[cont].puntos = Jugadores[cont].puntos + dado2.tiradaUnica();
                Jugadores[cont].puntos = Jugadores[cont].puntos + dado3.tiradaUnica();
            }

        }
        //Esta es la funcion que ordena de mayor a menor y lo imprime por pantalla , no pongo que devuelva un string por que es mejor que lo impima directamente, ya que de la otra manera solo te devuelve el id de la posicon donde esta en el array
        mostrarResultado(Jugadores)

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

}


class Jugador{
     var id = 0
     var puntos=0
    override fun toString(): String {
        return "El jugador $id, tiene $puntos puntos"
    }


}

//Funcion MostrarResultado
fun mostrarResultado(jugadores : List<Jugador>) {


    var tmp = 0
    var tmp2 = 0
    for(x in 0..99) {
        for(y in 0..99) {
            if(jugadores[x].puntos > jugadores[y].puntos) {
                tmp = jugadores[x].puntos
                tmp2 = jugadores[x].id
                jugadores[x].puntos = jugadores[y].puntos
                jugadores[x].id = jugadores[y].id
                jugadores[y].puntos = tmp
                jugadores[y].id = tmp2
            }
        }
    }

    for (a in 0..99){
        println(jugadores[a].toString())
    }

}