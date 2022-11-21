package com.feernandoalencar.curso_esr;

import com.feernandoalencar.curso_esr.di.modelo.Cliente;
import com.feernandoalencar.curso_esr.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoCliente;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoCliente = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@seuemail.com", "61 999999999");
        ativacaoCliente.ativar(joao);

        return "Hello!!!";
    }
}
