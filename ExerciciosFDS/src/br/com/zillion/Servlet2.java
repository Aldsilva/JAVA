package br.com.zillion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet2() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String resultado2 = null;
		
		String numInicial = request.getParameter("numero_inicial");
		
		String numFinal = request.getParameter("numero_final");
	
				
		/**if ((Integer.parseInt(numInicial)) > (Integer.parseInt(numFinal))) {
			resultado2 = "N�mero " + numInicial + " � maior que o n�mero " + numFinal; 
					
		}
		else if ((Integer.parseInt(numInicial)) < (Integer.parseInt(numFinal))) {
			resultado2 = "N�mero " + numInicial + " � menor que o n�mero " + numFinal; 
	
		}
		else resultado2 = "N�mero " + numInicial + " � igual ao n�mero " + numFinal; 
		*/
		
	    PrintWriter writer = response.getWriter(); 
	    
	    writer.write("<html><body>");
	    writer.write(resultado2);
	    writer.write("</body></html>");
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
