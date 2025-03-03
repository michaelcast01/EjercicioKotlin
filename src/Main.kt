fun main() {
    // Contadores de votos para cada candidato y medio
    var votosC1Internet = 0
    var votosC1Radio = 0
    var votosC1TV = 0

    var votosC2Internet = 0
    var votosC2Radio = 0
    var votosC2TV = 0

    var votosC3Internet = 0
    var votosC3Radio = 0
    var votosC3TV = 0

    // Costos por voto según medio
    val precioInternet = 700000
    val precioRadio = 200000
    val precioTV = 600000

    while (true) {
        println("\n=== SISTEMA ELECCIONES MUNICIPIO PREMIER ===")
        println("1. Votar")
        println("2. Ver costo de campaña")
        println("3. Vaciar urnas")
        println("4. Ver total de votos")
        println("5. Ver porcentajes")
        println("6. Ver costo promedio")
        println("7. Ver todos los resultados")
        println("8. Salir")
        print("Opción: ")

        when (readLine()) {
            "1" -> {
                // Votar
                print("Candidato (1-3): ")
                val candidato = readLine()?.toIntOrNull() ?: 0

                if (candidato !in 1..3) {
                    println("Candidato no válido")
                    continue
                }

                print("Medio (internet/radio/tv): ")
                val medio = readLine()?.lowercase() ?: ""

                // Registrar voto
                when (candidato) {
                    1 -> when (medio) {
                        "internet" -> votosC1Internet++
                        "radio" -> votosC1Radio++
                        "tv", "television" -> votosC1TV++
                        else -> {
                            println("Medio no válido")
                            continue
                        }
                    }
                    2 -> when (medio) {
                        "internet" -> votosC2Internet++
                        "radio" -> votosC2Radio++
                        "tv", "television" -> votosC2TV++
                        else -> {
                            println("Medio no válido")
                            continue
                        }
                    }
                    3 -> when (medio) {
                        "internet" -> votosC3Internet++
                        "radio" -> votosC3Radio++
                        "tv", "television" -> votosC3TV++
                        else -> {
                            println("Medio no válido")
                            continue
                        }
                    }
                }
                println("Voto registrado")
            }
            "2" -> {
                // Ver costo de campaña
                print("Candidato (1-3): ")
                val candidato = readLine()?.toIntOrNull() ?: 0

                // Calcular costo
                val costo = when (candidato) {
                    1 -> (votosC1Internet * precioInternet) + (votosC1Radio * precioRadio) + (votosC1TV * precioTV)
                    2 -> (votosC2Internet * precioInternet) + (votosC2Radio * precioRadio) + (votosC2TV * precioTV)
                    3 -> (votosC3Internet * precioInternet) + (votosC3Radio * precioRadio) + (votosC3TV * precioTV)
                    else -> {
                        println("Candidato no válido")
                        continue
                    }
                }
                println("Costo de campaña: $$costo")
            }
            "3" -> {
                // Vaciar urnas
                votosC1Internet = 0
                votosC1Radio = 0
                votosC1TV = 0

                votosC2Internet = 0
                votosC2Radio = 0
                votosC2TV = 0

                votosC3Internet = 0
                votosC3Radio = 0
                votosC3TV = 0

                println("Urnas vaciadas")
            }
            "4" -> {
                // Ver total de votos
                val totalVotos = votosC1Internet + votosC1Radio + votosC1TV +
                        votosC2Internet + votosC2Radio + votosC2TV +
                        votosC3Internet + votosC3Radio + votosC3TV
                println("Total de votos: $totalVotos")
            }
            "5" -> {
                // Ver porcentajes
                val votosC1 = votosC1Internet + votosC1Radio + votosC1TV
                val votosC2 = votosC2Internet + votosC2Radio + votosC2TV
                val votosC3 = votosC3Internet + votosC3Radio + votosC3TV
                val totalVotos = votosC1 + votosC2 + votosC3

                if (totalVotos > 0) {
                    val porcentajeC1 = (votosC1 * 100) / totalVotos
                    val porcentajeC2 = (votosC2 * 100) / totalVotos
                    val porcentajeC3 = (votosC3 * 100) / totalVotos

                    println("Candidato 1: $porcentajeC1%")
                    println("Candidato 2: $porcentajeC2%")
                    println("Candidato 3: $porcentajeC3%")
                } else {
                    println("No hay votos registrados")
                }
            }
            "6" -> {
                // Ver costo promedio
                val costoC1 = (votosC1Internet * precioInternet) + (votosC1Radio * precioRadio) + (votosC1TV * precioTV)
                val costoC2 = (votosC2Internet * precioInternet) + (votosC2Radio * precioRadio) + (votosC2TV * precioTV)
                val costoC3 = (votosC3Internet * precioInternet) + (votosC3Radio * precioRadio) + (votosC3TV * precioTV)
                val costoTotal = costoC1 + costoC2 + costoC3

                val totalVotos = votosC1Internet + votosC1Radio + votosC1TV +
                        votosC2Internet + votosC2Radio + votosC2TV +
                        votosC3Internet + votosC3Radio + votosC3TV

                if (totalVotos > 0) {
                    val promedio = costoTotal / totalVotos
                    println("Costo promedio: $$promedio")
                } else {
                    println("No hay votos registrados")
                }
            }
            "7" -> {
                // Ver todos los resultados
                val votosC1 = votosC1Internet + votosC1Radio + votosC1TV
                val votosC2 = votosC2Internet + votosC2Radio + votosC2TV
                val votosC3 = votosC3Internet + votosC3Radio + votosC3TV
                val totalVotos = votosC1 + votosC2 + votosC3

                val costoC1 = (votosC1Internet * precioInternet) + (votosC1Radio * precioRadio) + (votosC1TV * precioTV)
                val costoC2 = (votosC2Internet * precioInternet) + (votosC2Radio * precioRadio) + (votosC2TV * precioTV)
                val costoC3 = (votosC3Internet * precioInternet) + (votosC3Radio * precioRadio) + (votosC3TV * precioTV)
                val costoTotal = costoC1 + costoC2 + costoC3

                println("=== RESULTADOS ELECCIONES ===")
                println("Total votos: $totalVotos")

                if (totalVotos > 0) {
                    val porcentajeC1 = (votosC1 * 100) / totalVotos
                    val porcentajeC2 = (votosC2 * 100) / totalVotos
                    val porcentajeC3 = (votosC3 * 100) / totalVotos

                    println("\nCandidato 1:")
                    println("  Votos: $votosC1 ($porcentajeC1%)")
                    println("  Costo: $$costoC1")

                    println("\nCandidato 2:")
                    println("  Votos: $votosC2 ($porcentajeC2%)")
                    println("  Costo: $$costoC2")

                    println("\nCandidato 3:")
                    println("  Votos: $votosC3 ($porcentajeC3%)")
                    println("  Costo: $$costoC3")

                    val promedio = costoTotal / totalVotos
                    println("\nCosto promedio por voto: $$promedio")
                } else {
                    println("No hay votos registrados")
                }
            }
            "8" -> {
                println("Programa finalizado")
                return
            }
            else -> println("Opción no válida")
        }
    }

}
