package dependency_inverstion

class DatabaseService {

    fun getDatos() {}
}

class AccesoADatos(val databaseService: DatabaseService) {

    fun getDatos() {
        databaseService.getDatos()
    }
}

data class Dato(val dato: String)