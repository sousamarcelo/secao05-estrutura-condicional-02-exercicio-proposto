import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
