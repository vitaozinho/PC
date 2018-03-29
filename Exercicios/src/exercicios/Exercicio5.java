package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		
		int[] n = new int[15];
		int max = 0;
		int pos = 0;
		
		for(int i = 0 ; i < n.length ; i++) {
			System.out.print(i+1 + "º número: ");
			n[i] = usuario.nextInt();
			
			if(n[i]>max) {
				max = n[i];
				pos = i++;
			}
		}
		
		System.out.println("\nMaior valor digitado: "+max+"\nPosição: "+pos+"º");
		
	}

}
