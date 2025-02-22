class Persona(val nombre: String, var edad: Int) {

    override fun toString(): String {
        return "$nombre tiene $edad años"
    }

}