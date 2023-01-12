package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificacaoSMS;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.service.AtivacaoCliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("joao", "joao@321.com", "321321");
		Cliente c2 = new Cliente("maria", "maria@321.com", "312321");
		
		
		Notificador notificadorEmail = new NotificadorEmail();
		Notificador notificadorSMS = new NotificacaoSMS();
		
		AtivacaoCliente ativarCliente = new AtivacaoCliente(notificadorEmail);
		AtivacaoCliente ativarCliente2 = new AtivacaoCliente(notificadorSMS);
		
		
		ativarCliente.ativar(c1);
		ativarCliente2.ativar(c2);
	}
}
