package lista4;

import java.util.Scanner;

public class exercio07 {

/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo */	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//entrada do número
		System.out.println("Até que número você quer saber o valor ao quadrado e ao cubo:");
		int n = sc.nextInt();
		sc.close();
		
		//processamento
		for (int i=1; i<=n; i++) {
			
			//poderia ter usado função (Math.pow(a,b)) mas como era um calculo simples preferi fazer mais básico
			int iQuadrado = i * i;
			int iCubo = i * i * i;
			
			//ao final de cada calculo ele escreve o resultado
			System.out.println(i + " " + iQuadrado + " " + iCubo);
		}
	}

}
