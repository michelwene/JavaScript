import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int j;
		int sum;
		x = sc.nextInt();
		sc.nextLine();
		j = sc.nextInt();
		sc.nextLine();
		sum = x + j;
		System.out.printf("SUM = %d%n", sum);
	
		sc.close();
	}

}
