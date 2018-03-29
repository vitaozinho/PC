package exercicios;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner usuario = new Scanner(System.in);
		
		double nota[] = new double[10];
		double media;
		
		double soma = 0;
		
	
		int ordem = 1;
		
		for(int i = 0 ; i<=9 ; i++) {
			
			System.out.print("Digite a "+ordem+"ª nota: ");
			
			nota[i] = usuario.nextDouble();
			
			if(nota[i]<0 || nota[i]>10) {
				System.out.println("\n Digite apenas notas de 0 a 10.");
				i--;
			}else {
				ordem++;
			}
		}	
		
		for(int m = 0 ; m<=9 ; m++) {
			soma += nota[m];
		}	
		
		media = soma/10;
		System.out.println("\nMédia: "+media);
			
			
		}

	}


