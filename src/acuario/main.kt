package acuario

fun ejecutarSistema() {

    println("=== TANQUES ===")

    val tanque1 = Tanque()
    tanque1.mostrarInfo()

    val tanque2 = TanqueCircular(alto = 50, diametro = 30)
    tanque2.mostrarInfo()

    println("\n=== MASCOTAS (POLIMORFISMO) ===")

    // 🔥 POLIMORFISMO
    val mascotas: List<MascotaAcuatica> = listOf(PezBeta(), PezDorado())

    for (mascota in mascotas) {
        println("${mascota.nombre} es de color ${mascota.color}")

        // usamos la interfaz
        if (mascota is AccionMascota) {
            mascota.alimentarse()
        }

        println("--------------------")
    }

    println("\n=== CAMBIO DE VOLUMEN ===")

    tanque1.volumen = 100
    tanque1.mostrarInfo()
}

fun main() {
    ejecutarSistema()
}