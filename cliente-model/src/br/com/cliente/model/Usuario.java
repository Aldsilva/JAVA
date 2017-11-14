package br.com.cliente.model;

import java.util.List;

public class Usuario {
	
	private String usuario;
	
	private String senha;
	
	//Construtor Padrão
	public Usuario () {
			
	}	
	
	//Construtor com paramentro
	public Usuario (String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;		
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean login() {
		return false;
	}

	public static List<Usuario> select() {
		return null;
	}
	
	

}
