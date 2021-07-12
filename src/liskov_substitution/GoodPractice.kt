package liskov_substitution
 abstract class Vehiculo {
    // ...
    abstract fun numAsientos(): Int
}

internal class Renault : Vehiculo() {
    // ...
    override fun numAsientos(): Int {
        return 5
    }
}

internal class Moto : Vehiculo() {
    // ...
    override fun numAsientos(): Int {
        return 5
    }
}
fun main(args: Array<String>) {
    val arrayCoches = arrayOf(
        Moto(),
        Renault()
    )
    imprimirNumAsientos(arrayCoches)
}

fun imprimirNumAsientos(arrayCoches: Array<Vehiculo>) {
    for (coche in arrayCoches) {
        if (coche is Renault) System.out.println(coche.numAsientos())
        if (coche is Moto) System.out.println(coche.numAsientos())
    }
}