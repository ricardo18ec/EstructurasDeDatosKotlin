fun main() {

    // Lista mutable con nombres de gatos
    val gatos = mutableListOf("Moshiko", "Jhonny", "Simba")

    // Mapa mutable que asocia a cada gato con su edad
    val edades = mutableMapOf(
        "Moshiko" to 3,
        "Jhonny" to 1,
        "Simba" to 4
    )

    println("*** Lista inicial de Gatos ***")
    for (gato in gatos) {
        println(gato)
    }

    println("\n*** Edades de los Gatos ***")

    var sumaEdades = 0

    for ((nombre, edad) in edades) {
        println("$nombre tiene $edad años")
        sumaEdades += edad
    }

    // Cálculo del promedio de edad
    val promedio = sumaEdades.toDouble() / edades.size
    println("\nEdad promedio de los gatos: %.2f años".format(promedio))

    // Agregar un nuevo gato
    println("\nAgregando un nuevo gato...")
    gatos.add("Tom")
    edades["Tom"] = 1

    println("\n*** Lista Actualizada ***")
    for ((nombre, edad) in edades) {
        println("$nombre tiene $edad años")
    }
}