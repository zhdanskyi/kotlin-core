package model

class Student(name: String, surname: String, dni: String, mail: String, val studentCode: String, val tuition: String) :
    Person(name,surname,dni,mail) {

    //functions:
    override fun showUserData() {
        super.showUserData()
        println("studentCode = ${studentCode}")
        println("tuition = ${tuition}")
    }

}