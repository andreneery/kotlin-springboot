package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService {

    fun listar(): List<Topico> {
        //como não tem banco de dados vamos chumbar as informações na funçao

        val topico = Topico(
            id = 1,
            title = "Curso Kotlin",
            mensagem = "Aprendendo curso Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Lingaguem de programação"

            ),
            autor = Usuario(
                id = 1,
                nome = "Barbie Glow",
                email = "barbie@alura.com"
            )

        )
        return listOf(topico, topico, topico)
    }
}