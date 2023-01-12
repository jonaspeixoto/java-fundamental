package com.algaworks.di.notificacao;

import com.algaworks.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{

	public void notificar(Cliente cliente,String menssagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), menssagem);
	}
}
