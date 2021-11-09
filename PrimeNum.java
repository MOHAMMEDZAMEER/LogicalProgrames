import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please enter the number: ");
		int n = sc.nextInt();
		
		if (n < 2) {
			System.out.println(" This is NOT a prime number");
			return;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println(" This is NOT a prime number");
			return;
			}
		}
		System.out.println(" This is a prime number");
	}
}
