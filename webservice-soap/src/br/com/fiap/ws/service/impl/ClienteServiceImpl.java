package br.com.fiap.ws.service.impl;

import br.com.fiap.ws.entiy.Cliente;
import br.com.fiap.ws.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

	@Override
	public String busca(Cliente cliente) {
		return "Cliente: " + cliente.getNome() 
			+ " Email: " + cliente.getEmai();
	}

}
