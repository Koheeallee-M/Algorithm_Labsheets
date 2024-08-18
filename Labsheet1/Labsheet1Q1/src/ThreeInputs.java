import java.util.Scanner;
public class ThreeInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[3];
		Scanner inpreader = new Scanner(System.in); 
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter the number" + (i+1) + " : ");
			nums[i] = inpreader.nextInt();
		}
		int sum = 0;
		int avg = 0;
		int larg = 0;
		int prod = 1;
		int small = 999999999;
		
		for(int i = 0; i < 3; i++) {
			if(nums[i] > larg) {
				larg = nums[i];
			}
			if(nums[i] < small) {
				small = nums[i];
			}
		sum = sum + nums[i];
		prod = prod * nums[i];
		}
		avg = sum/3;
		
		System.out.println("The sum is: "+ sum);
		System.out.println("The product is: " + prod);
		System.out.println("The average is: " + avg);
		System.out.println("The smallest number is: " + small);
		System.out.println("The largest number is: " + larg);
	}

}
