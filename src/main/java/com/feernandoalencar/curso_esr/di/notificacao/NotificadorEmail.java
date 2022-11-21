package com.feernandoalencar.curso_esr.di.notificacao;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}