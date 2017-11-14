package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;

public class ClienteDao {
	
	private List<Cliente> clientes;
		
	public ClienteDao() {
		initMock();
	}
	
	private void initMock() {
	
		clientes = new ArrayList<Cliente>();
	
				
		clientes.add(new Cliente(1, "Alexsandro ", "Lázaro da Silva ", 44, "34-9999-1111"));
		
		}
	
		public List<Cliente> obterTodosClientes() {
	    return this.clientes;
	}
	
}
