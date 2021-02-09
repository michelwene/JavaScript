import java.util.Scanner;
import java.util.Locale;

public class exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double pi;
		double area;
		double radius;
		pi = 3.14159;
		radius = sc.nextDouble();
		sc.nextLine();
		area = pi * Math.pow(radius,2.0);
		System.out.printf("A = %.4f%n", area);
		sc.close();
	}
}
