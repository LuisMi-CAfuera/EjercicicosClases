fun main() {
    val dado1 = Dado()
    val dado2 = Dado()

    dado1.darValores(3,4)
    dado2.darValores(0,30)

    println("El dado1 ha obtenido un en tiradaUnica ${dado1.tiradaUnica()}")
    println("El dado1 ha obtenido un en tiradaDoble ${dado1.tiradaDoble()}")

    println("El dado2 ha obtenido un en tiradaUnica ${dado2.tiradaUnica()}")
    println("El dado2 ha obtenido un en tiradaDoble ${dado2.tiradaDoble()}")

}