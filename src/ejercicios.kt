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


// Reto 9: Traductor de Códigos de País
// Usamos un Map<String, String> donde la clave es el código
// ISO y el valor es el nombre del país, luego recorremos
// el mapa y mostramos cada código con su país correspondiente

fun reto9() {
    val paises = mapOf(
        "CO" to "Colombia",
        "US" to "Estados Unidos",
        "MX" to "México",
        "AR" to "Argentina",
        "BR" to "Brasil",
        "ES" to "España"
    )
    println("=== Reto 9: Traductor de Códigos de País ===")
    for (entry in paises) {
        println("El código ${entry.key} pertenece a ${entry.value}")
    }
}


// Reto 10: Rotación de Turnos de Trabajo
// Tenemos una lista de 7 empleados y rotamos k posiciones
// manualmente para que el descanso sea equitativo cada semana

fun reto10() {
    val empleados = mutableListOf("Ana", "Luis", "Carlos", "María", "Pedro", "Laura", "Jorge")
    val k = 2
    println("=== Reto 10: Rotación de Turnos de Trabajo ===")
    println("Turnos originales: $empleados")
    val rotados = mutableListOf<String>()
    val inicio = k % empleados.size
    for (i in inicio until empleados.size) rotados.add(empleados[i])
    for (i in 0 until inicio) rotados.add(empleados[i])
    println("Turnos rotados $k posiciones: $rotados")
}


// Reto 11: Organizador de Maleta
// Usamos un Map<Int, List<String>> para agrupar objetos
// según su peso en kg y no exceder el límite de la aerolínea

fun reto11() {
    val objetos = listOf(
        Pair("laptop", 2), Pair("ropa", 5), Pair("zapatos", 3),
        Pair("libros", 4), Pair("cargador", 1), Pair("cámara", 2)
    )
    val maleta = mutableMapOf<Int, MutableList<String>>()
    for (obj in objetos) {
        val peso = obj.second
        if (!maleta.containsKey(peso)) maleta[peso] = mutableListOf()
        maleta[peso]!!.add(obj.first)
    }
    println("=== Reto 11: Organizador de Maleta ===")
    println("Objetos agrupados por peso (kg):")
    for (entry in maleta) {
        println("  ${entry.key} kg -> ${entry.value}")
    }
}


// Reto 12: Verificador de Ruta Reversible
// Una ruta de entrega se guarda como lista de coordenadas
// Verificamos si es "espejo" (palíndromo) comparando
// manualmente el primer elemento con el último y así

fun reto12() {
    val ruta = listOf(1, 2, 3, 4, 3, 2, 1)
    var esEspejo = true
    val n = ruta.size
    var i = 0
    while (i < n / 2) {
        if (ruta[i] != ruta[n - 1 - i]) {
            esEspejo = false
            break
        }
        i++
    }
    println("=== Reto 12: Verificador de Ruta Reversible ===")
    println("Ruta: $ruta")
    println("¿Es ruta espejo (palíndromo)? $esEspejo")
}


// Reto 13: Reparto de Pedidos por Camión

fun reto13() {
    val paquetes = (1..50).toList()
    val tamanoLote = 10
    println("=== Reto 13: Reparto de Pedidos por Camión ===")
    var camion = 1
    var i = 0
    while (i < paquetes.size) {
        val lote = mutableListOf<Int>()
        for (j in i until minOf(i + tamanoLote, paquetes.size)) {
            lote.add(paquetes[j])
        }
        println("Camión $camion: $lote")
        i += tamanoLote
        camion++
    }
}


// Reto 14: Identificador de Ticket Único

fun reto14() {
    val tickets = listOf(101, 202, 303, 101, 404, 202, 505, 303, 606)
    val conteo = mutableMapOf<Int, Int>()
    for (t in tickets) {
        conteo[t] = (conteo[t] ?: 0) + 1
    }
    var unico: Int? = null
    for (entry in conteo) {
        if (entry.value == 1) {
            unico = entry.key
            break
        }
    }
    println("=== Reto 14: Identificador de Ticket Único ===")
    println("Primer ticket único: $unico")
}


// Reto 15: Calculadora de IVA Selectiva

fun reto15() {
    val precios = mapOf(
        "arroz" to 8000.0,
        "televisor" to 1200000.0,
        "pan" to 3000.0,
        "computador" to 2500000.0,
        "leche" to 4500.0
    )
    val conIva = mutableMapOf<String, Double>()
    for (entry in precios) {
        if (entry.value > 50000) {
            conIva[entry.key] = entry.value * 1.19
        }
    }
    println("=== Reto 15: Calculadora de IVA Selectiva ===")
    println("Productos con IVA (>$50.000): $conIva")
}


// Reto 16: Mantenimiento de Sensores

fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val iterator = sensores.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 3 == 0) iterator.remove()
    }
    println("=== Reto 16: Mantenimiento de Sensores ===")
    println("Sensores activos (sin múltiplos de 3): $sensores")
}



// Reto 17: Mapa de Almacén (Matriz)

fun reto17() {
    val almacen = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )
    var diagonalPrincipal = 0
    var diagonalSecundaria = 0
    val n = almacen.size
    for (i in 0 until n) {
        diagonalPrincipal += almacen[i][i]
        diagonalSecundaria += almacen[i][n - 1 - i]
    }
    println("=== Reto 17: Mapa de Almacén (Matriz 4x4) ===")
    println("Suma diagonal principal: $diagonalPrincipal")
    println("Suma diagonal secundaria: $diagonalSecundaria")
}


// Reto 18: Fusión de Recetas

fun reto18() {
    val chef1 = mapOf("harina" to 2.0, "azúcar" to 1.0, "mantequilla" to 0.5)
    val chef2 = mapOf("harina" to 1.5, "leche" to 2.0, "azúcar" to 0.5)
    val fusion = mutableMapOf<String, Double>()
    for (entry in chef1) fusion[entry.key] = entry.value
    for (entry in chef2) {
        fusion[entry.key] = (fusion[entry.key] ?: 0.0) + entry.value
    }
    println("=== Reto 18: Fusión de Recetas ===")
    println("Lista de compras combinada: $fusion")
}


// Reto 19: Ranking de Apps por Calificación

fun reto19() {
    val apps = mutableListOf(
        Pair("AppA", 4.2), Pair("AppB", 3.8), Pair("AppC", 4.9),
        Pair("AppD", 2.5), Pair("AppE", 4.7), Pair("AppF", 3.1),
        Pair("AppG", 4.5), Pair("AppH", 4.0), Pair("AppI", 3.6), Pair("AppJ", 4.8)
    )
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }
    println("=== Reto 19: Ranking de Apps - Top 10 ===")
    for (i in apps.indices) println("${i + 1}. ${apps[i].first} - ⭐ ${apps[i].second}")
}



// Reto 20: Unión de Agendas Ordenadas


fun reto20() {
    val agenda1 = listOf("Ana", "Carlos", "Laura", "Pedro")
    val agenda2 = listOf("Beatriz", "Diana", "Jorge", "María")
    val union = mutableListOf<String>()
    var i = 0
    var j = 0
    while (i < agenda1.size && j < agenda2.size) {
        if (agenda1[i] <= agenda2[j]) union.add(agenda1[i++])
        else union.add(agenda2[j++])
    }
    while (i < agenda1.size) union.add(agenda1[i++])
    while (j < agenda2.size) union.add(agenda2[j++])
    println("=== Reto 20: Unión de Agendas Ordenadas ===")
    println("Agenda maestra: $union")
}


// Reto 21: Días de Mantenimiento (Primos)

fun reto21() {
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }
    val marcas = arrayOf("Samsung", "LG", "Bosch", "Whirlpool", "Mabe", "Haceb")
    val pisos = mutableListOf<Pair<Int, String>>()
    var marcaIdx = 0
    for (piso in 1..100) {
        if (esPrimo(piso)) {
            pisos.add(Pair(piso, marcas[marcaIdx % marcas.size]))
            marcaIdx++
        }
    }
    println("=== Reto 21: Días de Mantenimiento (Pisos Primos) ===")
    for (p in pisos) println("  Piso ${p.first} -> ${p.second}")
}


// Reto 22: Pila de Platos Sucios (LIFO)

fun reto22() {
    val pila = mutableListOf<String>()
    fun push(plato: String) {
        pila.add(plato)
        println("Añadido: $plato")
    }
    fun pop(): String? {
        return if (pila.isEmpty()) {
            println("Pila vacía")
            null
        } else {
            val p = pila.removeAt(pila.size - 1)
            println("Lavado: $p")
            p
        }
    }
    println("=== Reto 22: Pila de Platos Sucios ===")
    push("Plato1")
    push("Plato2")
    push("Plato3")
    println("Pila actual: $pila")
    pop()
    pop()
    println("Pila restante: $pila")
}


// Reto 23: Seguimiento de Dieta

fun reto23() {
    val calorias = listOf(2100.0, 1850.0, 2300.0, 1900.0, 2050.0, 2200.0, 1950.0)
    println("=== Reto 23: Seguimiento de Dieta ===")
    for (i in 1 until calorias.size) {
        var suma = 0.0
        for (j in 0 until i) suma += calorias[j]
        val promedio = suma / i
        val diferencia = calorias[i] - promedio
        println("Día ${i + 1}: ${calorias[i]} kcal | Diferencia con promedio anterior: ${"%.2f".format(diferencia)}")
    }
}

// Reto 24: Organización de Contenedores

fun reto24() {
    val manifiesto = "((()))(())()"
    val pila = mutableListOf<Char>()
    var balanceado = true
    for (c in manifiesto) {
        if (c == '(') pila.add(c)
        else if (c == ')') {
            if (pila.isEmpty()) {
                balanceado = false
                break
            }
            pila.removeAt(pila.size - 1)
        }
    }

    if (pila.isNotEmpty()) balanceado = false
    println("=== Reto 24: Organización de Contenedores ===")
    println("Manifiesto: $manifiesto")
    println("¿Contenedores balanceados? $balanceado")
}

// Reto 25: Rendimiento de Maratón

fun reto25() {
    val tiempos = mutableListOf(245.0, 310.0, 198.0, 275.0, 320.0, 260.0, 189.0, 295.0)
    var maximo = tiempos[0]
    var minimo = tiempos[0]
    for (t in tiempos) {
        if (t > maximo) maximo = t
        if (t < minimo) minimo = t
    }
    tiempos.remove(maximo)
    tiempos.remove(minimo)
    var suma = 0.0
    for (t in tiempos) suma += t
    val promedio = suma / tiempos.size
    println("=== Reto 25: Rendimiento de Maratón ===")
    println("Tiempo eliminado (más lento): $maximo min")
    println("Tiempo eliminado (más rápido): $minimo min")
    println("Promedio real de entrenamiento: ${"%.2f".format(promedio)} min")
}


// Reto 26: Compresión de Logs de Servidor

fun reto26() {
    val logs = listOf("UP", "UP", "DOWN", "DOWN", "DOWN", "UP", "UP", "UP", "DOWN")
    val comprimido = mutableListOf<Pair<String, Int>>()
    var i = 0
    while (i < logs.size) {
        val estado = logs[i]
        var count = 1
        while (i + count < logs.size && logs[i + count] == estado) count++
        comprimido.add(Pair(estado, count))
        i += count
    }
    println("=== Reto 26: Compresión de Logs de Servidor ===")
    println("Logs comprimidos: $comprimido")
}


