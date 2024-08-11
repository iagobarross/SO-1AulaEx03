package view;

import controller.ControllerVetor;
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		ControllerVetor contVet = new ControllerVetor();
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int tamanho = 0;
		
		do{
			tamanho = sc.nextInt();
			}while(tamanho < 1 && tamanho > 100);
		
		int[] vetor = new int [tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(101);
		}
		
		contVet.verificarVetor(vetor);
		
		
		
	}

}