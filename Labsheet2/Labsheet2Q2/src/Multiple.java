import java.lang.Math;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num, quo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextFloat();
		System.out.println("Enter a quotient: ");
		quo = sc.nextFloat();
		float res = num/quo;
		if(res == Math.round(num/quo)) {
			System.out.println("It is a multiple");
		}
		else {
			System.out.println("Not a multiple");
		}
	}

}
