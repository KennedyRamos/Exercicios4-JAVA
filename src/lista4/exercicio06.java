package lista4;

import java.util.Scanner;

/*Ler um número inteiro N e calcular todos os seus divisores.*/

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//entrada do número
		System.out.println("De qual número você quer saber os divisores:");
		int n = sc.nextInt();
		sc.close();
		
		System.out.print("divisores: ");
		
		//cslculando os divisores
		for(int i=1; i<=n; i++) {
			
			//se o resto da divisão for igal a 0 esse numero correspondente ao 'i' é um divisor
			if (n%i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
