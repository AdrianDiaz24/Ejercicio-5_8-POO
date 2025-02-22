


open class Persona(val nombre: String, private val fechaNacimiento: String, val edad: Int = 0) {

    init {
        require(nombre.isNotBlank()) {throw IllegalArgumentException("El nombre no puede estar vacio")}
        require(edad >= 0) {throw IllegalArgumentException("La edad no puede ser negativa")}
    }

    override fun toString(): String {
        return "nombre: $nombre, edad: $edad años"
    }

    open fun actividad(){
        println("$nombre esta realizando una actividad")
    }

}
