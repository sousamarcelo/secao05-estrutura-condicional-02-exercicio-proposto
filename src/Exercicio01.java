import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();

	}

}
