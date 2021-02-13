import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial,horaFinal;
		int duracao;
		horaInicial = sc.nextInt();
		horaFinal= sc.nextInt();
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.println("O jogo durou " + duracao +  "horas");
		
		
		sc.close();
	}
}
