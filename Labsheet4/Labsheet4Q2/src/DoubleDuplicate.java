/*An array contains n numbers ranging from 0 to n – 2. There is exactly one number that is repeated in the
array. Write a program to find that duplicate number. For example, if an array with length 6 contains
numbers {0, 3, 1, 2, 3}, then the duplicate number is 3.*/
public int DupeFind(int[] Search) {
	int[] check = new int[Search.length - 2];
	for(int x: Search) {
		if (check[Search[x]] == 1) {
		return Search[x];
		break;
		}
		else {
		check[Search[x]] +=1;
		}
	}
}


public class DoubleDuplicate {

	public static void main(String[] args) {
		int[] testarray = new int[] {0,3,1,2,3};
		System.out.println(DupeFind(testarray));

	}

}
