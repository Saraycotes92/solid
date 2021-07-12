package open_close

class Coche(var marcaCoche: String)


fun main(args: Array<String>) {
    val arrayCoches = arrayOf(
        Coche("Renault"),
        Coche("Audi")
    )
    imprimirPrecioMedioCoche(arrayCoches)
}

// Como podemos ver, para cada nuevo coche habría que añadir nueva lógica al método precioMedioCoche(). Esto es un ejemplo sencillo, pero imagina que tu aplicación crece y crece… ¿cuántas modificaciones tendríamos que hacer? Mejor evitarnos esta pérdida de tiempo y dolor de cabeza, ¿verdad?
//
//Para que cumpla con este principio podríamos hacer lo siguiente:
fun imprimirPrecioMedioCoche(arrayCoches: Array<Coche>) {
    for (coche in arrayCoches) {
        if (coche.marcaCoche == "Renault") println(18000)
        if (coche.marcaCoche == "Audi") println(25000)
    }
}