import kotlin.random.Random

fun main() {
    // Array para almacenar estudiantes
    var students: Array = emptyArray()
    // guardar el tamanio de clase
    var classSize = 0
    // revisar si la clase esta llena
    var isFullyEnrolled = false

    while (true) {
        // MENU
        println("\n--- MAIN MENU ---")
        println("1. Crear aula")
        println("2. Anadir alumnos")
        println("3. Aula de estudiante")
        println("4. Call student to board")
        println("5. Salir")
        print("Choose an option: ")

        // Read user input safely
        val option = readlnOrNull()?.toIntOrNull() ?: 0

        when (option) {
            1 -> {
                print("Introduce el tamanio de la clase ")
                classSize = readlnOrNull()?.toIntOrNull() ?: 0

                if (classSize > 0) {
                    // Crear array de nulos
                    students = arrayOfNulls(classSize)
                    isFullyEnrolled = false
                    println("Class created with capacity for $classSize students.")
                } else {
                    println("Tamanio invalido.")
                }
            }

            2 -> {
                if (classSize == 0) {
                    println("Error.Crea la clase.")
                } else {
                    // Pedir el numero
                    for (i in 0 until classSize) {
                        print("escribe el nombre de estudiate ${i + 1}: ")
                        students[i] = readlnOrNull()
                    }
                    isFullyEnrolled = true
                    println("Los alumos se han anadido correctamente")
                }
            }

            3 -> {
                if (students.isEmpty()) {
                    println("Aula vacia.")
                } else {
                    println("\nLista de alumnos:")
                    // Imprimir nombres vacios
                    for (student in students) {
                        if (student != null) {
                            println("- $student")
                        }
                    }
                }
            }

            4 -> {
                // revisa si aula esta creada y llena
                if (classSize == 0 || !isFullyEnrolled || students.contains(null)) {
                    println("no todos los estudiantes estan metidos")
                } else {
                    // alumno aleatroio
                    val luckyStudent = students.random()
                    println("alumno aleaorio es : $luckyStudent 🎉")
                }
            }

            5 -> {
                println("Saliendo")
                return // Ends the main function and closes the app
            }

            else -> {
                println("Opcion invalida:escoga de 1 al 5.")
            }
        }
    }
}