

fun main(){

    val persona1 = Persona("Adrian", "6/4/2004", 20)
    val estudiante1 = Estudiante("Pepe", "7/5/2001", 23, "Ing. Informatica")

    println(persona1)
    println(estudiante1)

    persona1.actividad()
    estudiante1.actividad()

    try {
        val estudiante2 = Estudiante("Pepe", "7/5/2001", -23, "Ing. Informatica")
    } catch (e: IllegalArgumentException){
        println("**ERROR**: $e")
    }
}