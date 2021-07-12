package open_close

abstract class Vehiculo {

    abstract fun precioMedioCoche(): Int
}

internal class Renault : Vehiculo() {
    override fun precioMedioCoche(): Int {
        return 18000
    }
}

internal class Audi : Vehiculo() {
    override fun precioMedioCoche(): Int {
        return 25000
    }
}

internal class Mercedes : Vehiculo() {
    override fun precioMedioCoche(): Int {
        return 27000
    }
}

fun main(args: Array<String>) {
    val arrayCoches = arrayOf(
        Renault(),
        Audi(),
        Mercedes()
    )
    imprimirPrecioMedioCoche(arrayCoches)
}

fun imprimirPrecioMedioCoche(arrayCoches: Array<Vehiculo>) {
    for (coche in arrayCoches) {
        println(coche.precioMedioCoche())
    }
}