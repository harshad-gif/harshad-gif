package myPackage;

class MinAndMax{
	
	public int max(int []ar) {
		int max=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		return max;
	}
	
	public int min(int [] ar)
	{
		int min = ar[0];
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]<min) {
				min = ar[j];
			}
		}
		return min;
	}
	
}
public class ArrMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,1,3,4,5,7,9};
		MinAndMax m = new MinAndMax();
		System.out.println(m.min(arr));
		System.out.println(m.max(arr));
	}

}
