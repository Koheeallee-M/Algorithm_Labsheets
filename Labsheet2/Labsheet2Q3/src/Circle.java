import java.util.Scanner;
import java.lang.Math;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad, area, volume;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the radius: ");
		rad = sc.nextDouble();
		area = 4 * (Math.PI * Math.pow(rad, 2));
		volume = (4 * (Math.PI * Math.pow(rad, 3)))/3;
		System.out.println("Volume is: " + volume);
		System.out.println("Total surface area is: " + area);
	}

}