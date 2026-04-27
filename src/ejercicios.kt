// Reto 1: Control de Gastos Diarios
// Creamos un Array con 15 gastos, luego recorremos manualmente
// para calcular total, promedio, máximo y mínimo sin usar .sum()
fun reto1() {
    val gastos = arrayOf(12.5, 45.0, 8.3, 60.0, 22.1, 5.0, 33.4, 18.7, 90.0, 15.2, 40.0, 7.8, 55.5, 28.9, 11.1)
    var total = 0.0
    var maximo = gastos[0]
    var minimo = gastos[0]
    for (g in gastos) {
        total += g
        if (g > maximo) maximo = g
        if (g < minimo) minimo = g
    }
    val promedio = total / gastos.size
    println("=== Reto 1: Control de Gastos Diarios ===")
    println("Total: $total")
    println("Promedio diario: $promedio")
    println("Gasto más alto: $maximo")
    println("Gasto más bajo: $minimo")
}


// Reto 2: Filtro de Empleados Senior
// Usamos una lista de Pair<String, Int> (Nombre, Edad)
// Filtramos los mayores de 30 años y los ponemos en mayúsculas

fun reto2() {
    val empleados = listOf(
        Pair("Ana", 35), Pair("Luis", 28), Pair("Carlos", 42),
        Pair("María", 31), Pair("Pedro", 25), Pair("Laura", 50)
    )
    val seniors = mutableListOf<String>()
    for (e in empleados) {
        if (e.second > 30) seniors.add(e.first.uppercase())
    }
    println("=== Reto 2: Filtro de Empleados Senior ===")
    println("Empleados senior: $seniors")
}
