/*Suppose you buy a budget-priced pocket PC and discover that the chip inside can’t do
multiplication, but only addition. Thus, you are required to write a recursive method, mult(), that
performs multiplication of num1 and num2 by adding num1 to itself num2 times. Your method
must take as arguments num1 and num2 and return product of num1 and num2.*/
public class mult {
	
	public static int mult(int x, int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return x;
		}
		else {
			return x + mult(x, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(mult(6,7));
	}

}
