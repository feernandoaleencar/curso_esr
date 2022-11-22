package com.feernandoalencar.curso_esr.di.service;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;
import com.feernandoalencar.curso_esr.di.notificacao.NivelUrgencia;
import com.feernandoalencar.curso_esr.di.notificacao.Notificador;
import com.feernandoalencar.curso_esr.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @PostConstruct
    public void init() {
        System.out.println("INIT " + notificador);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
