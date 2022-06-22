package br.com.alura.forum.controller

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {
    /*o GetMapping serve para que todo metodo que esteja listado em
        * topicos entre na função
        */
    @GetMapping
    fun listar(): List<TopicoView>{
        return service.listar()
    }

    @GetMapping("/{id}")
    fun buscarId(@PathVariable id: Long): TopicoView{
        return service.buscarPorId(id)
    //o @PathVariable quer dizer que a informção é extraido da URL
    }

    //iremos criar um metodo que cadastra na listagem
    @PostMapping
    fun cadastrar(@RequestBody @Valid dto: NovoTopicoForm){
        service.cadastrar(dto)
    //o @RequestBody que dizer que as informações são extraidas do corpo da requisição
        // o Valid faz com que as informações sejam validas no NovoTopicoForm
    }
}