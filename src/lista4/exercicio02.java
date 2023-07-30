package lista4;

import java.util.Scanner;

/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//as variaveis estão em escopo global pq seram utilizadas depois do FOR
		int in = 0;
		int out = 0;
		
		//o numero digitado sera a quantidade de vezes que o usuario poderar entrar com valores que serão analisados
		System.out.println("Quantos números vão ser lidos?");
		int n = sc.nextInt();
		
		//entrada dos numeros
		for (int i=0; i<n; i++) {
			System.out.println("digite um número?");
			int x = sc.nextInt();
			
			//caso o numero caia no intervalo
			if (x>=10 && x<=20) {
				in += 1;
			}
			//se não cair
			else {
				out += 1;
			}
		}
		sc.close();
		
		//saida de dados
		System.out.println(in + " in");
		System.out.println(out + " out");
	}

}
