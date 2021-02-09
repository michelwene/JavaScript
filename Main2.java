import java.util.Locale;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double j;
		int t;
		String x;
		x = sc.next();
		t = sc.nextInt();
		j = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(t);
		System.out.println(j);
		sc.close();
		
		
	}

}
