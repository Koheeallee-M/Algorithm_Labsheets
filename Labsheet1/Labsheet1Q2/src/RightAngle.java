import java.util.Scanner;
import java.lang.Math;
public class RightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		boolean isRight = false;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Insert number " + (i+1) + ":");
			num[i] = sc.nextInt();
		}
		if ((Math.pow(num[0], 2) + Math.pow(num[1], 2)) == (Math.pow(num[2], 2))) {
			isRight = true;
		}
		if ((Math.pow(num[0], 2) + Math.pow(num[2], 2)) == (Math.pow(num[1], 2))) {
			isRight = true;
		}
		if ((Math.pow(num[1], 2) + Math.pow(num[2], 2)) == (Math.pow(num[0], 2))) {
			isRight = true;
		}
	
		if(isRight == true) {
			System.out.println("It is a right angled triangle");

		}
		else {
			System.out.println("It is not right-angled");
		}
	}


}
