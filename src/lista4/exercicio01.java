package lista4;

import java.util.Scanner;

/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
X, se for o caso*/

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite um numero entre 1 e 1000:");
		int x = sc.nextInt();
		sc.close();
		
		//estrutura FOR
		for (int i=0; i <= x; i++) {
			
			//variavel que recee o resto da divisão de x (escolhi usar uma variavel para armazenar esse valor para fiz didaticos, eventualmente ela pode ser descartada) 
			int impar = x%2;
			
			//se caso o numero for impar cai nessa condição
			if (impar != 0) {
				System.out.println(x);
			}
			
			//diminuição do valor de x apos cada verificação
			x -= 1;
		}
		
	}

}
