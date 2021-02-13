import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,z;
		x = sc.nextInt();
		z = sc.nextInt();
		if(x % z == 0 || z % x == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não são Múltiplos");
		}
		sc.close();
	}
}
