fun main(args:Array<String>){
//metodos
        var name : String = "name "



    //var = puede cambiar el valor
    //val = no puede cambiar su tipo(final)
        var apellido = "apellido"
        var userId : Long = 123123213123
        var userName = "username"
        var age = 10
        var skills : Boolean? = false;
        var localidad : String? = null  //nullSafety
        val userMail : String = "admin@admin.com"//final
        var telefono : Int//en algun momento se iniciara
        lateinit var pais: String







        //3





        /*
    println("Mi nombre es $name + mi id es: ${userId}, mi edad es : " +
            "  localidad : ${localidad?: "sin definir"}")
    println("Localidad: ${localidad?.length?: "no hay definicion"} + ${skills}")
    //leer por ocnsola todas las variables a excepcion de correo

    println("Introduce tu nombre")
    println("Name :"+readln())
    println("Introduce edad")
    println("Age :"+readln())
    println("Introduce skills")
    println("Skills: "+readln())

    println("Mi nombre es:${name},mi di es: ${userId},edad: ${age}")

         */
        //saludar(userName,apellido)
        //parametro nominal
        saludar(nombre = name,apellido = apellido)

}
fun saludar(nombre:String?=null,apellido: String?=null,veces: Int = 2){

    for (i in 0 .. 10 step 2){
        println("Saludos"+veces)
    }
    println("Hola ${nombre}, apellido : ${apellido}")

    (0 until veces).forEach { println("Hola ${nombre}, apellido : ${apellido}") }
    (0 until veces).forEachIndexed { _, index -> println("Saludo n ${index}:hola buenas saludo foreachindex") }



var sumarFlecha : (Int,Int) -> Unit = {x:Int,y: Int ->println(x+y)}

}
