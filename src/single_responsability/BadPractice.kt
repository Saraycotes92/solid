package single_responsability

// Vioola el principio de single reponsability
class Coche(marca: String) {
    private var marca: String = marca

    fun getMarca(): String {
        return marca
    }

    fun guardarCocheDB(coche: Coche) {
        //TODO  Guardar en db
    }
}