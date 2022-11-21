package com.feernandoalencar.curso_esr.di.service;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;
import com.feernandoalencar.curso_esr.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    //@Autowired(required = false) //atributo
    @Autowired //atributo
    private List<Notificador> notificadores;

    /*@Autowired - Construtor
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }*/

    /*public AtivacaoClienteService(String qualquerCoisa){

    }*/

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if (notificadores != null) {
            for (Notificador notificador : notificadores) {
                notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
            }
        } else {
            System.out.println("Não existe notificador, mais cliente foi ativado!");
        }
    }

    /*@Autowired Setter
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }*/
}
