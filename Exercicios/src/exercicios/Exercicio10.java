package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
			
			Scanner usuario = new Scanner(System.in);
			
			int ord = 1;
			
			char opc = 'N';
			
			while(opc != 'S') {
				System.out.print("\nC�digo do "+ord+"� funcion�rio: ");
				int cdFunc = usuario.nextInt();
				
				System.out.print("Horas trabalhadas: ");
				double hsTrab = usuario.nextInt();
				
				double salario = hsTrab*10.00;
				
				if(hsTrab > 50.00) {
					double pagExcesso = (hsTrab - 50.00)*20.00;
					System.out.println("\nSal�rio total: R$"+salario+"\nSal�rio excedente: R$"+pagExcesso);
				}else {
					double pagExcesso = 0;
					System.out.println("Sal�rio total: R$"+salario+"\nPgto. excedente: R$"+pagExcesso);
				}
				
				ord++;
				
				System.out.print("\nDeseja encerrar o programa? (S para finalizar): ");
				opc = usuario.next().charAt(0);
			}
			System.out.println("\n - Programa finalizado! - \n");
		
	}

}
