package myPackage;

public class PairOfSum {

	public static void main(String[] args) {
		int arr[]= {2,7,4,-5,11,5,20};
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					System.out.println(arr[i]+" + "+arr[j]+" =  "+k);
				}
			}
		}

	}

}
