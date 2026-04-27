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


// Reto 3: Limpieza de Contactos Duplicados
// Usamos un Set para eliminar los números repetidos
// y luego los mostramos ordenados para la nueva agenda

fun reto3() {
    val telefonos = listOf(111, 222, 333, 111, 444, 222, 555, 333, 666, 777,
        888, 111, 999, 444, 222, 123, 456, 789, 321, 654)
    val unicos = telefonos.toSet()
    val ordenados = unicos.sorted()
    println("=== Reto 3: Limpieza de Contactos Duplicados ===")
    println("Números únicos ordenados: $ordenados")
}


// Reto 4: Análisis de Carrito de Compras
// Usamos un Map<String, Int> para contar cuántas unidades
// hay de cada producto que el cliente agregó al carrito

fun reto4() {
    val carrito = listOf("manzana", "leche", "manzana", "pan", "leche", "manzana", "huevos")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        if (conteo.containsKey(producto)) {
            conteo[producto] = conteo[producto]!! + 1
        } else {
            conteo[producto] = 1
        }
    }
    println("=== Reto 4: Análisis de Carrito de Compras ===")
    println("Conteo de productos: $conteo")
}


// Reto 5: Historial de Navegación Reversible
// Usamos un Array<String> con las últimas 5 URLs visitadas
// y lo invertimos manualmente con un ciclo sin usar .reverse()

fun reto5() {
    val urls = arrayOf("google.com", "youtube.com", "github.com", "stackoverflow.com", "kotlin.org")
    println("=== Reto 5: Historial de Navegación Reversible ===")
    print("URLs invertidas: ")
    var i = urls.size - 1
    while (i >= 0) {
        print(urls[i])
        if (i > 0) print(", ")
        i--
    }
    println()
}


// Reto 6: Compatibilidad de Intereses (Match)
// Usamos dos Set<String> de intereses y comparamos manualmente
// para encontrar los comunes y los exclusivos de la persona 1

fun reto6() {
    val persona1 = setOf("fútbol", "música", "viajes", "cocina", "cine")
    val persona2 = setOf("música", "cine", "deportes", "viajes", "lectura")
    val comunes = mutableSetOf<String>()
    val exclusivos = mutableSetOf<String>()
    for (interes in persona1) {
        if (persona2.contains(interes)) comunes.add(interes)
        else exclusivos.add(interes)
    }
    println("=== Reto 6: Compatibilidad de Intereses ===")
    println("Intereses en común: $comunes")
    println("Exclusivos de persona 1: $exclusivos")
}


// Reto 7: Inventario de Despensa
// Usamos un MutableMap<String, Int> para gestionar alimentos
// Implementamos lógica para consumir (restar) y alertar
// cuando un producto se agota (eliminarlo del mapa)

fun reto7() {
    val despensa = mutableMapOf("arroz" to 5, "leche" to 2, "pan" to 1, "huevos" to 12)
    println("=== Reto 7: Inventario de Despensa ===")
    println("Inventario inicial: $despensa")
    val producto = "leche"
    val cantidad = 2
    if (despensa.containsKey(producto)) {
        val restante = despensa[producto]!! - cantidad
        if (restante <= 0) {
            despensa.remove(producto)
            println("¡Alerta! $producto se agotó y fue eliminado del inventario.")
        } else {
            despensa[producto] = restante
            println("$producto restante: $restante")
        }
    }
    println("Inventario final: $despensa")
}


// Reto 8: Cálculo de Promedio Académico
// Usamos una lista de Pair<Double, Double> donde el primero
// es la nota y el segundo el porcentaje de valor (0.0 a 1.0)
// Multiplicamos cada nota por su peso y sumamos para la final

fun reto8() {
    val notas = listOf(
        Pair(4.5, 0.3),
        Pair(3.8, 0.2),
        Pair(4.0, 0.25),
        Pair(3.5, 0.25)
    )
    var notaFinal = 0.0
    for (n in notas) {
        notaFinal += n.first * n.second
    }
    println("=== Reto 8: Cálculo de Promedio Académico ===")
    for (i in notas.indices) {
        println("  Nota ${i + 1}: ${notas[i].first} x ${notas[i].second * 100}% = ${"%.2f".format(notas[i].first * notas[i].second)}")
    }
    println("Nota final definitiva: ${"%.2f".format(notaFinal)}")
}