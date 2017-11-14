package br.com.clienteweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = getParameter(request, "txtUsuario");
		String senha = getParameter(request, "txtSenha");
		
		UsuarioDao dao = new UsuarioDao();
		List<> usuarios.dao
			
	}
	
	private String getParameter(HttpServletRequest request, String paramentro) {
		
		if(request != null && parametro != null && !parametro.equals(""))
			return request.getParameter(paramentro);
		
		return "";
	}

}
