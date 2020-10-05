import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Programa feito por mim, que funcionou
		System.out.print("Digite a hora inicial: ");
		int horaInicial = sc.nextInt();
		System.out.print("Digite a hora final: ");
		int horaFinal = sc.nextInt();

		if (horaInicial < 0 || horaFinal > 24) {
			System.out.println("Valores invalidos");
		}else if (horaFinal < horaInicial) {
			int conculoHoraDentroDoDia = 24 - horaInicial;
			int duracao = conculoHoraDentroDoDia + horaFinal;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		} else {
			int duracao = horaFinal - horaInicial;
			System.out.println("O jogo durou " + duracao + " hora(s)");
		}
		
		//Programa feito pelo professo corrigido. mas para mim quando colocado inicial e final 0 a 
		//solução dele de 24, no meu a solução deu 0 que seria o correto.
//		int horaInicial = sc.nextInt();
//		int horaFinal = sc.nextInt();
//		
//		int duracao;
//		
//		if (horaInicial < horaFinal) {
//			duracao = horaFinal - horaInicial;
//		} else {
//			duracao = 24 - (horaInicial + horaFinal);
//		}
//		
//		System.out.println("O JOGO DUROU" + duracao + " HORA(S)");
		
		sc.close();
	}

}
