/*Suppose that you have been given an array which contains one or more duplicates. Write a program to
remove all duplicates from array. For example, if the array is {1, 2, 1, 2, 3, 4, 5} then your program should
return the array {1, 2, 3, 4, 5}.*/
import java.util.HashSet;
import java.util.Set;

public class HashArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[] {1,4,5,6,7,4,8,5,2,2,1,0};
		
		Set<Integer> newval = new HashSet<>();
		
		for(int x: values) {
			newval.add(values[x]);
		}
		
		System.out.println(newval);
	}

}
