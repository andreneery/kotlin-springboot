package br.com.alura.forum.model

import java.time.LocalDateTime

data class Topico (
    val id: Long? = null,
    val title: String,
    val mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val curso: Curso,
    val autor: Usuario,
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    val resposta: List<Resposta> = ArrayList()
)