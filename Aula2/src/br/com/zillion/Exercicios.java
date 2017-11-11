package br.com.zillion;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Exercicios {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String resultado = null;	
		
	String num1 = request.getParameter("numero1");
//		int x = Integer.parseInt(num1);
		
	String num2 = request.getParameter("numero2");
//		int y = Integer.parseInt(num2);
	
	if ((Integer.parseInt(num1)) > (Integer.parseInt(num2))) {
		resultado = "numero " + num1 + " é maior que o numero " + num2;
				
	}
	else resultado = "numero " + num1 + " é menor que o numero " + num2;
	{
		if ((Integer.parseInt(num1)) = (Integer.parseInt(num2))) {
			resultado = "numero " + num1 + " é igual ao numero " + num2;
			
		}

	
	

		
	

	