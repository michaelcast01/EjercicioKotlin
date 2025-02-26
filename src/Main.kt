fun main() {
    // Variable de fallos
    var fallos = 0

    // no puede pasar de 3 fallos
    while (fallos < 3) {
        print("Por favor, ingrese su código de acceso: ")
        val entrada = readLine()
        val codigoAcceso = entrada?.toIntOrNull()
        if (codigoAcceso == null) {
            fallos++
            println("Código inválido. Intente nuevamente.")
            continue
        }
        // Verifica el rango correspondiente
        when (codigoAcceso) {
            // Empleados (1000-1999)
            in 1000..1999 -> {
                println("Acceso autorizado. Bienvenido, empleado número: $codigoAcceso")
            }
            // Visitantes (2000-2999)
            in 2000..2999 -> {
                print("Ingrese su nombre: ")
                val nombreVisitante = readLine() ?: ""
                print("Ingrese el motivo de su visita: ")
                val razonVisita = readLine() ?: ""
                println("Acceso autorizado. Bienvenido, visitante $nombreVisitante. Motivo: $razonVisita")
            }
            // Códigos inválidos
            else -> {
                fallos++
                // Bloquea si se superan 3 intentos
                if (fallos == 3) {
                    println("Acceso denegado. Se ha bloqueado el sistema por demasiados intentos.")
                } else {
                    println("Código incorrecto. Por favor, intente de nuevo.")
                }
            }
        }
    }
}
