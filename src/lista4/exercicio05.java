package lista4;

import java.util.Scanner;

/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1 */

public class exercicio05 {

	public static void main(String[] args) {
		
		//essa variavel recebe o valor resultante do calculo, ela precisa ser 1 se for 0 ira xerar tbm o resultado.
		int fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		//lendo o número que sera calculado
		System.out.println("Fatotial de:");
		int n = sc.nextInt();
		sc.close();
		
		//calculo do fatorial
		for(int i=0; i<n; i++) {
			
			// aqui é feito o calculo onde inicia-se: fatorial = faotrial * (n-i) -> 1 = 1 * (n-i)
			fatorial *= n-i;
		}
		
		// exibindo o resultado
		System.out.println("Resultado: " + fatorial);
	}

}
