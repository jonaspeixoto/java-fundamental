package com.algaworks.di.service;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;

public class AtivacaoCliente {
	
	private Notificador notificar;
	
	public AtivacaoCliente(Notificador notificar) {
		this.notificar = notificar;
	}
	
	
	public void ativar(Cliente cliente) {
		cliente.Ativar();
		this.notificar.notificar(cliente, "Seu cadastro está ativo");
	}
}
