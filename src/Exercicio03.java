import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//ordem crescente ou decrescente.

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero inteiro: ");
		int A = sc.nextInt();
		System.out.print("Digite o segundo numero inteiro: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");		
		} else {
			System.out.println("N�o s�o Multiplos");
		}
				
		sc.close();

	}

}
