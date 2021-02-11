import java.util.Scanner;
import java.util.Locale;

public class exercise4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		double worked_hours;
		double hour_value;
		double salary;
		x = sc.nextInt();
		sc.nextLine();
		worked_hours = sc.nextDouble();
		sc.nextLine();
		hour_value = sc.nextDouble();
		sc.nextLine();
		salary = hour_value * worked_hours;
		System.out.printf("Number = %d%n", x);
		System.out.printf("Salary = U$%.2f%n", salary);
		
		sc.close();
	}

}

