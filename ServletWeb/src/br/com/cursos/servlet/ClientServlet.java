package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String filtro = request.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);
				
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		writer.write("<ul>");
		
		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");
		}
		
		writer.write("</ul>");
		writer.write("</body></html>");
						
	}
	
	private List<String> filtrarClientes(String filtro) {
		
		List<String> clientes = new ArrayList<String>();
		List<String> ListaFiltrada = new ArrayList<String>();
		
		clientes.add("Alexsandro Lázaro da Silva");
		clientes.add("Alexsandro Silva");
		clientes.add("Jandeilson");
		clientes.add("Catia I");
		clientes.add("Catia II");
		clientes.add("Lazaro");
		
		if(filtro != null && !filtro.equals("")) {
			for (String cliente : clientes) {
				if(cliente.toUpperCase().contains(filtro.toUpperCase()))
					ListaFiltrada.add(cliente);
			}
		} else {
			ListaFiltrada = clientes;
		}
		
		return ListaFiltrada;
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	
	}

}
