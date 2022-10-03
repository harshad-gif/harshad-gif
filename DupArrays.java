package myPackage;

public class DupArrays {

	public static void main(String[] args) {
		int [] arr = {1,2,2,3,4,5,6,7,8,8};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((arr[i]==arr[j]) && (i!=j))
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
