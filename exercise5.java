import java.util.Scanner;
import java.util.Locale;

public class exercise5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code;
		int code1;
		int pieceNumber;
		int pieceNumber1;
		double pieceValue;
		double pieceValue1;
		double partsValue;
		System.out.println("Enter part code: ");
		code = sc.nextInt();
		System.out.println("Enter the number of pieces: ");
		pieceNumber = sc.nextInt();
		System.out.println("Enter the price of the parts: ");
		pieceValue = sc.nextDouble();
		System.out.println("Enter part code: ");
		code1 = sc.nextInt();
		System.out.println("Enter the number of pieces: ");
		pieceNumber1 = sc.nextInt();
		System.out.println("Enter the price of the parts: ");
		pieceValue1 = sc.nextDouble();
		partsValue = (pieceValue*pieceNumber) + (pieceValue1*pieceNumber1);
		System.out.printf("Price to pay = R$ %.2f%n", partsValue);
		sc.close();
	}

}
