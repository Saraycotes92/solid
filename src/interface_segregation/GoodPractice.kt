package interface_segregation

internal interface IAveNoVoladora {
    fun comer()
}

internal interface IAveVoladora {
    fun volar()
}

internal interface IAveNadadora {
    fun nadar()
}

internal class Lorito : IAveNoVoladora, IAveVoladora {
    override fun volar() {
        //...
    }

    override fun comer() {
        //...
    }
}
 class Pinguinito : IAveNoVoladora, IAveNadadora {
    override fun nadar() {
        //...
    }

    override fun comer() {
        //...
    }
}