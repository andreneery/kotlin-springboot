package br.com.alura.forum.controller

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import br.com.alura.forum.service.TopicoService
import com.sun.source.doctree.AttributeTree.ValueKind
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Provider.Service
import java.time.LocalDateTime
import java.util.*
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {
    /*o GetMapping serve para que todo metodo que esteja listado em
        * topicos entre na função
        */
    @GetMapping
    fun listar(): List<Topico>{
        return service.listar()
    }

}