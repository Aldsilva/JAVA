package br.com.cliente.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class buscaServlet
 */

@WebServlet("/buscaServlet")
public class buscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.obterTodosClientes();
		
		out.write("<ul>");
		
		for(int indice = 0; indice < clientes.size(); indice++) {
			out.write("<li>");
			out.write("cliente: " + clientes.get(indice).getNomeCompleto());
			out.write("</li>");
			
		}
		
		out.write("</ul>");
		out.write("</body><html>");
				
		
		
	}


}
