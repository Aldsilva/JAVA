package br.com.cliente.dao;

import java.util.List;
import java.util.ArrayList;

import br.com.cliente.model.Cliente;

public class ClienteDao {
	
	private List<Cliente> clientes;
	
	public ClienteDao()	{
		initMock();
	}
	
	private void initMock() {
		
		clientes = new ArrayList<Cliente>();
		
		/**
		 * Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setNome("Jan");
		cliente.setIdade(30);
		cliente1.setSobreNome("Nascimento");
		cliente1.setTelefone("999999999");
		 */
		
		clientes.add(new Cliente(1, "Jandeilson", "Nascimento", 30, "99999"));
						
	}
	
	public List<Cliente> obterTodosClientes() {
		return this.clientes;
		
	}

}
