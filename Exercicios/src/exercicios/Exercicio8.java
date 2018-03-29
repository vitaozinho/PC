package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {									
		
		Scanner usuario = new Scanner(System.in);
		
		System.out.print("Digite N: ");
		int n = usuario.nextInt();
		int fator = 1;
		
		for(int i = 1 ; i<=n ; i++) {
			fator = fator*i;
		}
		
		System.out.println(n+"! = "+fator);
	}

}
