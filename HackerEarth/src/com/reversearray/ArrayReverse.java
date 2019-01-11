package com.reversearray;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		
	int i;
	int arr[]=new int[100];
	/*int arr1[]=new int[100];
	int temp=0;*/
	System.out.println("enter the number of items");
	Scanner sc=new Scanner(System.in);
	i=Integer.parseInt(sc.nextLine());
	System.out.println("enter the array---->");
	
	for(int j=0;j<i;j++)
	{
		System.out.println("enter the value to be added in array");
		int k=Integer.parseInt(sc.nextLine());
		arr[j]=k;
		System.out.println(arr[j]);
		
	}
	
	System.out.println("reverse array is---->");
	for(int l=(i-1);l>=1;l--)
	{
		System.out.println(arr[l]);
	}
	
	
	
	System.out.println("-------------------------");
	System.out.println("-------------------------");

	
	/*int no=i-1;
	for(int f=0;f<i;f++)
	{
		//System.out.println(arr[f]);
		
		System.out.println("-------------------------");
		System.out.println(no);
		System.out.println("-------------------------");

		temp=arr[f];
		if((no+1)>=f)
		{
			arr1[no]=temp;
			System.out.println(arr1[no]);
			
		}
		no--;
		
		
	
	}
	
	
	System.out.println("array 2 values are-->");
	for(int j=0;j<i-1;j++)
	{
		
		System.out.println(arr1[j]);
	}
	*/

 }
}