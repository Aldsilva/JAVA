package br.com.zillion;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public String imprimeSequencial(String numInicial, String numFinal) {
		
		int num1 = Integer.parseInt(numInicial);
		int num2 = Integer.parseInt(numFinal);
		
		List<Integer> sequencial = new ArrayList<Integer>();
		
		if (num1 >= 0 || num2 >=0) {
			if (num1 != num2 ) {
				if (!(num1 > num2)) {
					
					for (int x = num1; x <= num2; x++) {
						
						sequencial.add(x);
						
					}
				} //O Parametro Inicial não pode ser maior que o Final.
				
			} //Nao aceitar Numeros Iguais.
		
		} //Não aceitar Numeros Negativos.
		
		return sequencial.toString();
	}
	
	
}
