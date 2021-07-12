package dependency_inverstion
//Así, sin importar el tipo de conexión que se le pase al módulo AccesoADatos, ni este ni sus instancias tendrán que cambiar, por lo que nos ahorraremos mucho trabajo.
internal interface Conexion {
    fun getDatos(): Dato

    fun setDatos()
}

internal class AccesoADatosGood(private val conexion: Conexion) {
    fun getDatos() {
        conexion.getDatos()
    }
}