package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		
		int[] n = new int[2];
		int contador = 0;
		
		System.out.print("1º numéro: ");
		n[0] = usuario.nextInt();
		
		System.out.print("2º numéro: ");
		n[1] = usuario.nextInt();
		
		Arrays.sort(n);
		
		for(int i = n[0] ; i<=n[1] ; i++) {
			if(n[0]%2 == 1) {
				contador++;
			}
			n[1]--;
		}
		
		System.out.print("\nExistem, "+contador+" números ímpares entre os numeros digitados.");
		
	}

}
