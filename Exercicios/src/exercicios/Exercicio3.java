package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		
		System.out.print("Tabuada do numero: ");
		int n = usuario.nextInt();
		
		for(int i = 1 ; i>0 && i<=10 ; i++) {
			System.out.println(n+" x "+i+" = "+ n*i);
		}
		
	}
}
