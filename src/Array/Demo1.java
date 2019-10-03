package Array;

import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("**********************************************");
		//int arr[]= {10,20,30,40,50,60,706,9787654};
		//int[] arr = new int[5]; 
		double[] a = new double[5];
		Scanner s1 = new Scanner(System.in);
		System.out.println("How Many Elements You Want to Store...?");
	//	int sizee = s1.nextInt();
		
	//	int[] arrr = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter"+ (i+1)+" element...");
			a[i] = s1.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**********************************************");
	}
}
