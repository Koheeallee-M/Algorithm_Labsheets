/*Write a recursive function BinarySearch that takes as input a sorted array myArray and a key
searchKey and searches for searchKey in myArray using the Binary Search algorithm.*/
public class recursiveBinarySearch {
	public static int recursiveBSearch(int myArray[], int searchKey) {
		int leftnode = 0;
		int rightnode = myArray.length;
		int midnode = (leftnode + rightnode)/2;
		
		if (myArray[midnode] == searchKey) {
			return midnode;
		}
		
		else if(myArray[midnode] > searchKey) {
			return recursiveBSearch(myArray[])
		}
	}

	public static void main(String args[]) {
		
	}
}
