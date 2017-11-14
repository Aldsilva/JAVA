package br.com.zillion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String resultado = null;
		
		String num1 = request.getParameter("numero1");
		
		String num2 = request.getParameter("numero2");
		
		if ((Integer.parseInt(num1)) > (Integer.parseInt(num2))) {
			resultado = "N�mero " + num1 + " � maior que o n�mero " + num2; 
					
		}
		else if ((Integer.parseInt(num1)) < (Integer.parseInt(num2))) {
			resultado = "N�mero " + num1 + " � menor que o n�mero " + num2; 
	
		}
		else resultado = "N�mero " + num1 + " � igual ao n�mero " + num2; 
		
	    PrintWriter writer = response.getWriter(); 
	    
	    writer.write("<html><body>");
	    writer.write(resultado);
	    writer.write("</body></html>");
	    
	}
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
		

