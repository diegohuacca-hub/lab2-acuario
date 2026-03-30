package acuario

import kotlin.math.PI

// INTERFAZ
interface AccionMascota {
    fun alimentarse()
}

// CLASE ABSTRACTA
abstract class MascotaAcuatica {
    abstract val nombre: String
    abstract val color: String
}

// CLASE BASE (open)
open class Tanque(
    open var largo: Int = 50,
    open var ancho: Int = 30,
    open var alto: Int = 40
) {

    open var volumen: Int
        get() = largo * ancho * alto / 1000
        set(valor) {
            alto = (valor * 1000) / (largo * ancho)
        }

    open val forma = "rectangular"

    open fun mostrarInfo() {
        println("Forma: $forma")
        println("Dimensiones: $largo x $ancho x $alto cm")
        println("Volumen: $volumen litros")
    }
}

// SUBCLASE (cilíndrica)
class TanqueCircular(
    override var alto: Int,
    var diametro: Int
) : Tanque(largo = diametro, ancho = diametro, alto = alto) {

    override val forma = "cilíndrico"

    override var volumen: Int
        get() = ((PI * (diametro / 2) * (diametro / 2) * alto) / 1000).toInt()
        set(valor) {
            alto = ((valor * 1000) / (PI * (diametro / 2) * (diametro / 2))).toInt()
        }
}

// CLASES CON HERENCIA + INTERFAZ
class PezBeta : MascotaAcuatica(), AccionMascota {
    override val nombre = "Pez Beta"
    override val color = "azul"

    override fun alimentarse() {
        println("$nombre come pequeñas larvas")
    }
}

class PezDorado : MascotaAcuatica(), AccionMascota {
    override val nombre = "Pez Dorado"
    override val color = "naranja"

    override fun alimentarse() {
        println("$nombre come hojuelas")
    }
}