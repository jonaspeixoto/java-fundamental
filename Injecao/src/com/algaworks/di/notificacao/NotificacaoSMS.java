package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificacaoSMS implements Notificador {

	public void notificar(Cliente cliente,String menssagem) {
		System.out.printf("Notificando %s atraves do Telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), menssagem);
	}
}
