package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.collections.ArrayList

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
){
    fun listar(): List<TopicoView> {
        //como não tem banco de dados vamos chumbar as informações na funçao
    return topicos.stream().map {
            t -> topicoViewMapper.map(t)
    }.collect(Collectors.toList())

    }

    fun buscarPorId(id: Long): TopicoView {
        val topico = topicos.stream().filter { t ->
            t.id == id
        }.findFirst().get()
        return topicoViewMapper.map(topico)
    }

    fun cadastrar(form: NovoTopicoForm) {
        var topico = topicoFormMapper.map(form)
        topicos = topicos.plus(topico)
        topico.id = topicos.size.toLong() + 1
    }
}