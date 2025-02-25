fun main() {
    // Denominacion permitida
    val m20 = 20
    val m50 = 50
    val m100 = 100
    val m200 = 200
    val m500 = 500

    // Contar monedas
    var monedas20 = 0
    var monedas50 = 0
    var monedas100 = 0
    var monedas200 = 0
    var monedas500 = 0

    // Menú
    var opcion: String?
    do {
        println("\nMenú:")
        println("1. Agregar Moneda")
        println("2. Contar monedas")
        println("3. Total Ahorrado")
        println("4. Romper Alcancía")
        println("5. Salir")
        print("Seleccione una opción: ")
        opcion = readLine()

        when (opcion) {
            "1" -> {
                print("Ingresar Moneda (20, 50, 100, 200, 500): ")
                val valor = readLine()!!.toInt()
                when (valor) {
                    m20 -> {
                        monedas20++
                        println("Se ha agregado una moneda de $$m20.")
                    }
                    m50 -> {
                        monedas50++
                        println("Se ha agregado una moneda de $$m50.")
                    }
                    m100 -> {
                        monedas100++
                        println("Se ha agregado una moneda de $$m100.")
                    }
                    m200 -> {
                        monedas200++
                        println("Se ha agregado una moneda de $$m200.")
                    }
                    m500 -> {
                        monedas500++
                        println("Se ha agregado una moneda de $$m500.")
                    }
                    else -> println("Moneda de $$valor no permitida.")
                }
            }
            "2" -> {
                println("\nConteo de monedas:")
                println("Monedas de $$m20: $monedas20")
                println("Monedas de $$m50: $monedas50")
                println("Monedas de $$m100: $monedas100")
                println("Monedas de $$m200: $monedas200")
                println("Monedas de $$m500: $monedas500")
            }
            "3" -> {
                val total = monedas20 * m20 + monedas50 * m50 + monedas100 * m100 + monedas200 * m200 + monedas500 * m500
                println("\nTotal ahorrado: \$$total")
            }
            "4" -> {
                monedas20 = 0
                monedas50 = 0
                monedas100 = 0
                monedas200 = 0
                monedas500 = 0
                println("\nLa alcancía se ha  vaciado.")
            }
            "5" -> println("Saliendo del programa...")
            else -> println("Opción inválida, por favor intente nuevamente.")
        }
    } while (opcion != "5")
}
