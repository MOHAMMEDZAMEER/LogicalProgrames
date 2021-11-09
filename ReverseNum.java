import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		
		System.out.print(" Please enter the number: ");
		int n = sc.nextInt();
		
		while (n != 0) {
			rev = rev*10 + n%10;
			n /= 10;
		}
		
		System.out.println(" The reverse number is: " + rev);
	}
}
