import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,z;
		x = sc.nextInt();
		z = sc.nextInt();
		if(x % z == 0 || z % x == 0) {
			System.out.println("S?o M?ltiplos");
		}else {
			System.out.println("N?o s?o M?ltiplos");
		}
		sc.close();
	}
}
