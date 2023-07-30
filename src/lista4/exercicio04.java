package lista4;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */
public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//aqui o usuario escolhe quantos calculos ele precisa fazer
		System.out.println("Quantas divisões ia fazer?");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			
			//numerador
			System.out.print("Numerador:");
			float a = sc.nextFloat();
			
			//denominador
			System.out.print("Denominador:");
			float b = sc.nextFloat();
			
			//com o denominador igual a 0 é exibido essa mensagem
			if(b==0){
				System.out.println("divisão impossivel!");
			}
			else {
				
				float div = a/b;
				// o resultado
				System.out.printf("Resultdo: %.2f%n",div);	
			}
			
		}

		sc.close();
	}

}
