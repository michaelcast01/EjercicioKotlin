fun main() {
    //  Variables
    val dado1 = IntArray(10)
    val dado2 = IntArray(10)
    var suma1 = 0
    var suma2 = 0
    // Dado 1
    println("Dado 1:")
    for (i in 0..9) {
        dado1[i] = (1..6).random()
        println("Tirada ${i+1}: ${dado1[i]}")
        suma1 += dado1[i]
    }
    // Dado 2
    println("\nDado 2:")
    for (i in 0..9) {
        dado2[i] = (1..6).random()
        println("Tirada ${i+1}: ${dado2[i]}")
        suma2 += dado2[i]
    }
    // Mostrar resultados
    println("\nValores del Dado 1:")
    for (i in 0..9) {
        print("${dado1[i]}")
        if (i < 9) print(", ")
    }
    println("\nValores del Dado 2:")
    for (i in 0..9) {
        print("${dado2[i]}")
        if (i < 9) print(", ")
    }
    // Mostrar sumas
    println("\n\nSuma del Dado 1: $suma1")
    println("Suma del Dado 2: $suma2")
    // Mostrar ganador
    println("\nResultado final:")
    if (suma1 > suma2) {
        println("¡Ganó el Dado 1!")
    } else if (suma2 > suma1) {
        println("¡Ganó el Dado 2!")
    } else {
        println("¡Empate!")
    }
}