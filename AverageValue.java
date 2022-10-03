package myPackage;

public class AverageValue {

	public static void main(String[] args) {
		int arr[] = {3,4,5,7,9};
		int sum=0;
		double av = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
			av = sum/arr.length;
			
			System.out.println(av);
		}
		
		

	}

}
