package interface_segregation

internal interface IAve {
    fun volar()
    fun comer()
    fun nadar()
}

internal class Loro : IAve {
    override fun volar() {
        //...
    }

    override fun comer() {
        //..
    }

    override fun nadar() {
      // los loros no nadan
    }
}

internal class Pinguino : IAve {
    override fun volar() {
        //...
    }

    override fun comer() {
        //..
    }

    override fun nadar() {
        TODO("Not yet implemented")
    }
}