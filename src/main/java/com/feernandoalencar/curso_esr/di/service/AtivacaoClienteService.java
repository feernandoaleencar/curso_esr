package com.feernandoalencar.curso_esr.di.service;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;
import com.feernandoalencar.curso_esr.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;


    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}