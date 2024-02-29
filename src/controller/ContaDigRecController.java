/*
 * 1. Crie uma fun��o recursiva que exiba 
 * a quantidade de d�gitos de um n�mero inteiro
 * passado como par�metro:
 * O c�digo deve trazer como coment�rios:
 * A condi��o de parada;
 * Como escrever a fun��o para o termo 'n' em fun��o do termo anterior.
 * 
 */

package controller;

public class ContaDigRecController {

	public ContaDigRecController() {
		
		super();
	}

	// Fun��o recursiva para contar d�gitos.
    public static int contadigitos(int n) {
    	
        // Condi��o de parada: 
    	// Quando o n�mero for menor que 10, possui apenas 1 d�gito.
    	  if (n < 10) {
            return 1;
            
        } else {
            // Chamada recursiva: 
        	// A quantidade de d�gitos de n � igual a 1 (d�gito atual) 
        	// mais a quantidade       	
            // de d�gitos dos pr�ximos n�meros (n / 10) 
        	// ap�s remover o �ltimo d�gito.
            return 1 + contadigitos(n / 10);
        }
    }
}
