class Estudiante(nombre: String, fechaNacimiento: String, edad: Int, val carrera: String): Persona(nombre, fechaNacimiento, edad) {

    override fun toString(): String {
        return super.toString() + "Carrera: $carrera"
    }

    override fun actividad() {
        println("$nombre esta haciendo una actividad de $carrera")
    }

}