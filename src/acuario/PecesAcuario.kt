package acuario

// Interfaz
interface AccionPez {
    fun comer()
}

// Clase abstracta
abstract class Pez {
    abstract val color: String
}

// Tiburón implementa interfaz
class Tiburon : Pez(), AccionPez {
    override val color = "gris"

    override fun comer() {
        println("cazar y comer peces")
    }
}

// PezPayaso implementa interfaz
class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"

    override fun comer() {
        println("comer algas")
    }
}