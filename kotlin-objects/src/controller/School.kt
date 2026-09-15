package controller

import model.Director
import model.Person
import model.Student
import model.Teacher
import kotlin.text.equals

class School {
    lateinit var people : ArrayList<Person>
    lateinit var teachers: ArrayList<Teacher>
    lateinit var students: ArrayList<Student>
    var director : Director? = null

    //inicialize always after the constructor:
    init {
        people = arrayListOf()
        teachers = arrayListOf()
        students = arrayListOf()
    }

    fun addDirector(director: Director){
        if (director!=null){
            println("You already have director,add them?")
            var assertation = readln()

            if (assertation.equals("y",ignoreCase = true)){
                println("Director succefuly eliminated")
                this.director = director

                 }else{
                println("Director not eliminated")
                return
                 }
             } else{
            this.director = director
            return
             }
        }
    //tuit students method
    fun tuitStudents(student: Student,teacher: Teacher){
        val peopleExists: Person? = people.find { it.dni.equals(teacher.dni,true) }
        val directorExists : Person? = people.find {  }
        if (student.e){
            println("Can't add student with these data")
        }else{
            println("Name: ")
            val studentName: String = readln();
            println("Surname: ")
            val studentSurmname: String = readln()
            println("DNI: ")
            val studenDNI:String = readln()
            println("Mail: ")
            val studentMail: String = readln()
            println("NIA/student code : ")
            val studentCode: String = readln()
            println("Student tuition: ")
            val studentTuition: String = readln()
            people.add(Student(studentName,studentSurmname,studenDNI,studentMail,studentCode,studentTuition))
            println("The student with name ${student.name} was succefully added!")
        }

    }
    fun listStudents(student: Student): Unit{
        students.forEach {
            if (it is Teacher){
                it.showUserData()
            }
        }
    }
    fun listTeachers(teacher: Teacher): Unit{
        teachers.forEach {
            if (it is Teacher){
                it.showUserData()
            }
        }
    }

}
