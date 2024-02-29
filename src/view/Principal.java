package view;

import controller.ContaDigRecController;

public class Principal {

	public static void main(String[] args) {
		
			ContaDigRecController cd = new ContaDigRecController();
		
			//int numero = 12345;
	        int numero = 678910;
	        int contadigitos = cd.contadigitos(numero);      
	        
	        System.out.println("Número de dígitos em " + numero + ": " + contadigitos);
	    }

	}

