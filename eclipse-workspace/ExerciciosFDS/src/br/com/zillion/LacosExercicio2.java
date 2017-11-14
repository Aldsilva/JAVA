package br.com.zillion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LacosExercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LacosExercicio2() {
        super();
       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String numInicial = request.getParameter("Inicial");
		String numFinal = request.getParameter("Final");
		String sequencial = null;
		
		Exercicio2 resultado = new Exercicio2();
		
		sequencial = resultado.imprimeSequencial(numInicial, numFinal);
		
		System.out.println(sequencial);
		PrintWriter writer = response.getWriter();
		
		writer.write("<html><body>");
		writer.write(sequencial);
		writer.write("</body></html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
