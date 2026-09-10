package tasks

fun num() {
    println("Indica el numero que quieres multiplicar")
    println("Primer numero:")
    var n1 = readln().toInt();
    println("segundo numero")
    var n2 = readln().toInt();

    for (i in n1..n2){
        println("tabla de ${i}")
       for (j in 0..10){
           println("${i} * ${j} = ${j*i}")
       }
    }

}
