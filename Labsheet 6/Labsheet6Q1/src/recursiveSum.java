/*Write a recursive function recursiveSum that computes the sum of the first num integers (i.e., 1 +
2 + 3 + ... + num). Write a program to test your function.*/

public class recursiveSum {
	
	public static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n + recursiveSum(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println(recursiveSum(7));
	}

}
