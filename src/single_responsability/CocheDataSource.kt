package single_responsability

class CocheDataSource {

    fun guardarCocheInDB(coche: Coche){
        //TODO guardar coche en db
    }

    fun eliminarCocheDB(coche: Coche){
        // TODO eliminar coche
    }
}

class Coche1(marca: String) {
    private var marca: String = marca

    fun getMarca(): String {
        return marca
    }
}
