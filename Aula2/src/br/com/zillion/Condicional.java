package br.com.zillion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Condicional {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String paramUm = request.getParameter("paramUm");
	int x = Integer.parseInt(paramUm);

	String mensagemASerExibida;
 
	writer.write("<html><body>");
	writer.write("mensagemASerExibida");
	writer.write("</html></body>");

	private String convertNumberToExtenso(String numero) {
		
		String retorno;
		
		if(numero != null && !numero.equals("")) {
			
			if(numero.equals("1"))
				return "Um";
			else if(numero.equals("2"))
				return "Dois";
			else if(numero.equals("3"))
				return "Tres";
			
			return retorno;			
	}

   }

}


