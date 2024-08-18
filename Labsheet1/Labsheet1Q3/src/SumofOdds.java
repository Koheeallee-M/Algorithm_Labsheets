import java.util.Scanner;
public class SumofOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a number");
		int target = sc.nextInt();
		int count = 1;
		while(count<=target) {
			sum = sum + count;
			count = count + 2;
		}
		System.out.println("The total is: " + sum);
	}

}
