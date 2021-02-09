import java.util.Scanner;
import java.util.Locale;

public class exercise3 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			int A;
			int B;
			int C;
			int D;
			double variation;
			A = sc.nextInt();
			sc.nextLine();
			B = sc.nextInt();
			sc.nextLine();
			C = sc.nextInt();
			sc.nextLine();
			D = sc.nextInt();
			sc.nextLine();
			variation = (A * B - C*D);
			System.out.printf("variation = %.0f%n", variation);

			
			sc.close();
	}

}




//expected results entry: 	5 	6	7	8	= 	-26
// ||    	||  	   ||	5	6	-7	8	=	86