package model

open class Person(val name: String,var surname: String,val dni: String) {

    constructor(name:String,surname:String,dni: String,email: String?):this(name,surname,dni){
        this.email = email;
    }

    //null email,user cant have email(null)
    var email: String? = null

    open fun showUserData(){
        println("name = ${name}")
        println("surname = ${surname}")
        println("dni = ${dni}")
        println("email = ${email?:"no email data"}")
    }

}
