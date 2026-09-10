package tasks

import kotlin.random.Random

fun main() {

    /*
    println("Indica el tamano de Array: ")
    var array = readln().toInt()
    println("Rango incial: ")
    var x = readln().toInt()
    println("Rango final")
    var y = readln().toInt()
    val numeros : Array<Int?> = arrayOfNulls(array)

    for (i in x..y){
        for (j in x..y){
            println("Suma elementos: ${i+j}")

        }
    }
     */

    print("tamanio: ")
    val n = readln().toInt()
    print("min: ")
    val min = readln().toInt()
    print("max: ")
    val max = readln().toInt()

    val array = IntArray(n) { Random.nextInt(min, max + 1) }
    println("array: ${array.joinToString(" ")}")
    println("suma: ${array.sum()}")
    println("media: ${array.average()}")

    var num: Int
    do {
        print("numero en rango ($min-$max): ")
        num = readln().toInt()
    } while (num !in min..max)

    val reps = array.count { it == num }
    if (reps > 0) {
        println("el numero esta presente")
        println("el numero $num se repite $reps veces")
    } else {
        println("el numero no esta presente")
    }

    //switch
    val opcion = 1
    when(opcion){
        1->{}
        2->{}
        3->{}
        4->{}
        5->{}

    }
    //realizar una aplicacion quedecida que alumno saldra a corregir el examen etx
    //1.menu opciones:
        //1crear clase
        //2matricular alumnospedira todos los nombres de lso alumnos(pueden ser repetidos)
        //3

}



    /*
    var elementos: Array<Int?> = arrayOfNulls(5)
    for(i in 0 until  elementos.size){
        println(elementos[i])
    }
     */
//}
//pedir por consola el tamanio del array
// pedir el rango de numeros inicial y final
//indicar la suma de todos los eleemnetos del array
//indicar la media de los elementos del array
//continuar pidiendo mientras while el numero no este en el rango
//el numero esta presente
//el numero xxx se repite 7 veces

