package com.feernandoalencar.curso_esr.di.notificacao;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
