package myPackage;

import java.util.*;
public class ArrayPractice {

	//WAP to sort numeric array
	public static void main(String[] args) {
		//using Arrays method
		int [] a= {1789,2035,1899,1546,2013};
		int temp=0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//using logic
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
