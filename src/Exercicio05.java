import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o codigo: ");
		int codigo = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		double cachorroQuente1 = 4.00;
		double xSalada2 = 4.50;
		double xBacon3 = 5.00;
		double torradaSimples4 = 2.00;
		double refriterante5 = 1.50;
		
		
		if (codigo == 1) {
			System.out.printf("Pedido: %s Cachorro Quentes%n", quantidade);			
			System.out.printf("Valor total: R$%.2f%n", cachorroQuente1*quantidade);
		} else if (codigo == 2) {
			System.out.printf("Pedido: %s xSalada%n", quantidade);			
			System.out.printf("Valor total: R$%.2f%n", xSalada2*quantidade);
		} else if (codigo == 3) {
			System.out.printf("Pedido: %s xBacon%n", quantidade);			
			System.out.printf("Valor total: R$%.2f%n", xBacon3*quantidade);
		} else if (codigo == 4) {
			System.out.printf("Pedido: %s Torrada Simples%n", quantidade);			
			System.out.printf("Valor total: R$%.2f%n", torradaSimples4*quantidade);
		} else if (codigo == 5) {
			System.out.printf("Pedido: %s Refriterante(s)%n", quantidade);			
			System.out.printf("Valor total: R$%.2f%n", refriterante5*quantidade);
		} else {
			System.out.println("Codigo invalido");
		}
		
		sc.close();

	}

}
