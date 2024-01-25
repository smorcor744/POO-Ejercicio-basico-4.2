import javax.swing.text.StyledEditorKit.BoldAction

/**
 * Ejercicio 4.2
 * Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.
 *
 * Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo se calcula en función del peso y la altura. Por tanto no se debe poder modificar, pero si consultar.
 *
 * Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.
 *
 * Implementa el método toString, representación del objeto en forma de String: override fun toString() = "". (Pulsa Ctrl+o)
 *
 * En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario y b) mostrarlas por consola. A continuación, realizar lo siguiente:
 *
 * Sobre la persona 1: a) modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio. b) Mostrar por consola sólo el nombre, peso y altura.
 * Sobre la persona 3: a) Mostrar el peso, altura y imc. b) Modificar la altura, por ejemplo a 1.80 c) Mostrar el peso, altura y imc.
 * Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona 3. b) Mostrar la persona 2 y persona 3. c) Comparar si las dos personas son iguales, y mostrar el resultado. d) Implementa el método equals():boolean (Pulsa Ctrl+o). e) Ejecutar la comparación. */



class Persona( var peso: Double, var altura: Double ) {
    val imc = this.peso / (this.altura * this.altura)
    var nombre: String = ""
        set(value) {
            require(true and (value != "")){"El nombre no puede ser nulo o vacio."}
            field = value
        }
    constructor(nombre: String, peso: Double, altura: Double, ) : this(peso, altura) {
        this.nombre = nombre
    }
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString() = "${this.nombre} con una altura de ${this.altura}m y un peso ${this.peso}kg tiene un IMC de ${this.imc}"

//    fun saludar(nombre: String) {
//        return println("Buenas ${this.nombre}.")
//    }
//    fun obtenerImc() = this.imc
//    fun obtenerTipoImc(): String {
//        when {
//            this.imc in 18.5..20.2 -> return "peso insuficiente"
//             18.5 <= this.imc < 18.5 -> return "peso insuficiente"
//            this.imc < 18.5 -> return "peso insuficiente"
//              this.imc < 25.0 -> return "peso insuficiente"
//              this.imc < 25.0 -> return "peso insuficiente"
//              this.imc < 25.0 -> return "peso insuficiente"
//        }
//    }
//    fun mostrarDesc(){
//
//        println("${this.nombre} con una altura de ${this.altura}m y un peso ${this.peso}kg tiene un IMC de ${obtenerImc()}")}
    companion object {
    }
}