package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		
		int contaPar = 0;
		int contaImp = 0;
		int contaPos = 0;
		int contaNeg = 0;
		
		int ord = 1;
		
		char opc = 'N';
		
		while(opc != 'Y') {
			System.out.print(ord+"º valor: ");
			int n = user.nextInt();
			
			if(n%2 == 0) {
				contaPar++;
			}
			
			if(n%2 == 1) {
				contaImp++;
			}
			
			if(n>0) {
				contaPos++;
			}
			
			if(n<0) {
				contaNeg++;
			}
			
			ord++;
			n = 0;
			
			System.out.print("Deseja encerrar o programa? (Y para finalizar): ");
			opc = user.next().charAt(0);

		}
		System.out.println("-----------------------\nPares: "+contaPar+"\nImpares: "+contaImp+"\nPositivos: "+contaPos+"\nNegativos: "+contaNeg);
		System.out.println("\n - Programa finalizado! - \n");
	}
}
