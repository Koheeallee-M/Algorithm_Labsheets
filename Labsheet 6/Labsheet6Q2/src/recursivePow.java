/*Write a recursive function recursivePower that raises any integer value num to an arbitrary power
pow. Write a program to test your function.*/
public class recursivePow {
	public static int recursivePower(int n, int x) {
		if(x == 0) {
			return 1;
		}
		else {
			return n * recursivePower(n, x - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(recursivePower(2,6));
	}

}
