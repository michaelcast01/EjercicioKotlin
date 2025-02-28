fun main() {
    // Variables
    var saldo = 0
    var seguirJugando = true

    println("¡Bienvenido a Apuesta y gana!")
    println("Ingresa la cantidad de dinero inicial:")
    val deposito = readLine()?.toInt() ?: 0
    saldo = deposito

    while (seguirJugando) {
        println("\nTu saldo actual es: $saldo")
        println("Presiona ENTER para jugar...")
        readLine()

        val resultado = (Math.random() * 3).toInt() + 1
        println("Ha salido el número: $resultado")

        when (resultado) {
            1 -> {
                val dineroAnterior = saldo
                saldo *= 2
                println("Has multiplicado tu dinero por dos")
                println("Saldo anterior: $dineroAnterior")
                println("Saldo actual: $saldo")

                if (saldo > 0) {
                    println("¿Quieres seguir jugando? (S/N)")
                    seguirJugando = readLine() == "S"
                }
            }
            2 -> {
                val dineroAnterior = saldo
                saldo /= 2
                println("Has perdido la mitad de tu dinero")
                println("Saldo anterior: $dineroAnterior")
                println("Saldo actual: $saldo")

                if (saldo > 0) {
                    println("¿Quieres seguir jugando? (S/N)")
                    seguirJugando = readLine() == "S"
                }
            }
            3 -> {
                println("Has perdido todo tu dinero")
                saldo = 0
                seguirJugando = false
            }
        }
    }

    if (saldo <= 0) {
        println("\nTe has quedado sin dinero")
    } else {
        println("\nGanaste: $saldo")
    }

    println("Gracias por participar")
}
