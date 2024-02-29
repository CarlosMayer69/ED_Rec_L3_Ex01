/*
 * 1. Crie uma função recursiva que exiba 
 * a quantidade de dígitos de um número inteiro
 * passado como parâmetro:
 * O código deve trazer como comentários:
 * A condição de parada;
 * Como escrever a função para o termo 'n' em função do termo anterior.
 * 
 */

package controller;

public class ContaDigRecController {

	public ContaDigRecController() {
		
		super();
	}

	// Função recursiva para contar dígitos.
    public static int contadigitos(int n) {
    	
        // Condição de parada: 
    	// Quando o número for menor que 10, possui apenas 1 dígito.
    	  if (n < 10) {
            return 1;
            
        } else {
            // Chamada recursiva: 
        	// A quantidade de dígitos de n é igual a 1 (dígito atual) 
        	// mais a quantidade       	
            // de dígitos dos próximos números (n / 10) 
        	// após remover o último dígito.
            return 1 + contadigitos(n / 10);
        }
    }
}
