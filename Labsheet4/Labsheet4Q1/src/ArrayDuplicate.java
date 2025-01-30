/* Given an integer array of size n – 1 which contains integers in the range [1, n], you are required to find the
missing number from the first n integers. Note that there are no duplicates in the list.*/

public static int FindDupe(int SearchArray[]) {
	int[] Store = new int[SearchArray.length + 1];
	int ans;
	for(int i = 0; i <= (SearchArray.length); i ++) {
		Store[SearchArray[i]] +=1;
	}
	for(int x: Store) {
		if(Store[x] == 0) {
		ans = Store[x];	
		}
	};
	return ans;
}



public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] test = new int[] {4,3,2,5};
		System.out.println(FindDupe(test));
	}

}
