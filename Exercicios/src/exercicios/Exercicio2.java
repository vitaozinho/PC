package exercicios;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio2 {
    public static void main (String[]args) {
   

        Scanner usuario = new Scanner(System.in);

        int[] n = new int[2];

        System.out.print("1º numero: ");
        n[0] = usuario.nextInt();

        System.out.print("2º numero: ");
        n[1] = usuario.nextInt();
        
        if(n[0]<n[1]) {
        	int aux = n[1];
        	n[1] = n[0];
        	n[0] = aux;
        }
        
        for(int i = n[0] ; n[0] >= n[1] ; i++) {
        	if(n[0]%2 == 1 || n[0]%2 == -1) {
        		System.out.println(n[0]);
        	}
        		n[0]--;
        }
        
    }
}
