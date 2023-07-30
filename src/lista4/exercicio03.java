package lista4;

import java.util.Locale;
import java.util.Scanner;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5 */

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// a quantidade digitada será a quantidade de vezes que o FOR se 
		System.out.println("Quantos testes você vai corrigir?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			//entrada das notas 1, 2 e 3
			System.out.println("Digite a primeira nota:");
			float nota1 = sc.nextFloat();
			
			System.out.println("Digite a segunda nota:");
			float nota2 = sc.nextFloat();
			
			System.out.println("Digite a tercira nota:");
			float nota3 = sc.nextFloat();
			
			//calculo da média
			double media = (nota1*2.0 + nota2*3.0 + nota3*5.0);
			
			//saida de dados
			System.out.println(media);
			
		}
		sc.close();

	}

}
