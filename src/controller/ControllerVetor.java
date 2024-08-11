/*3. Fazer uma aplicação Java em Eclipse, que permita ao usuário, por Scanner ou JOptionPane,
entrar o tamanho (n) de um vetor de inteiros (limite a entrada a 100) e entrar com os n
valores. Deve-se fazer uma classe de controle que tenha uma operação que receba o vetor
como parâmetro, percorra o vetor utilizando for each e, caso o número seja ímpar, exiba o
número e a indicação que é ímpar e, caso seja par, exiba apenas os múltiplos de 10, e a
indicação de que são pares e múltiplos de 10. A resposta deve ser um print do console com
um vetor de entrada de 8 posições.
*/

package controller;

public class ControllerVetor {
	
	public ControllerVetor() {
		super();
	}
	
	public void verificarVetor(int[] vet) {
		int tamanho = vet.length;
			for(int numero:vet) {
				if(numero % 2 != 0) {
					System.out.println("O número " + numero + " é ímpar.");
				} else if(numero % 2 == 0 && numero % 10 == 0){
					System.out.println("O número " + numero + " é par e divisível por 10.");
				} else {
					System.out.println("O número " + numero + " não atende as exigências.");
				}
		}
	}
}
