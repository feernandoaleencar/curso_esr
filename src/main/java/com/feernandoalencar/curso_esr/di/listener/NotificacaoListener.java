package com.feernandoalencar.curso_esr.di.listener;

import com.feernandoalencar.curso_esr.di.notificacao.NivelUrgencia;
import com.feernandoalencar.curso_esr.di.notificacao.Notificador;
import com.feernandoalencar.curso_esr.di.notificacao.TipoDoNotificador;
import com.feernandoalencar.curso_esr.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoListener {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
