package myPackage;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,8,9,4,5,6};
		int n = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[n-2]);

	}

}
