// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel:Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)
    }
}

fun main() {
    val Drake = Usuario()
    val Kendrick = Usuario()
    val Rocky = Usuario()
    val Wayne = Usuario()

    val Materia1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val Materia2 = ConteudoEducacional("Estruturas de Dados", 120)
    val Materia3 = ConteudoEducacional("Arquitetura Mobile", 80)

    val formacao = Formacao("Mobile Developer", Nivel.AVANCADO, listOf(Materia1, Materia2, Materia3))
    
    formacao.matricular(Drake)
    formacao.matricular(Kendrick)
    formacao.matricular(Rocky)
    formacao.matricular(Wayne)

    }
