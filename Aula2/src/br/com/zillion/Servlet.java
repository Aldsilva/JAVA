package br.com.zillion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Exercicio1 tipo = new Exercicio1();		
		
		
		PrintWriter writer = response.getWriter();	
		
		/**
		writer.write("<html><body>");
		writer.write("<ul>");
		writer.write("<li>");
		writer.write("Valor de X: " + tipo.x);
		writer.write("</li>");
		writer.write("<li>");
		writer.write("Valor de y: " + tipo.y);
		writer.write("</li>");
		writer.write("</ul>");
		writer.write("</body></html>");
		*/
		
		writer.write("<html><body>");
		writer.write("<ul>");
		writer.write("<li>");
		writer.write(tipo.getValorVariavel());
		writer.write("</li>");
		writer.write("</ul>");
		writer.write("</body></html>");
							
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
