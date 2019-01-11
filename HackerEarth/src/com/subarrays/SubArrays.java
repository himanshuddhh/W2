package com.subarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrays {
	
	public static void main(String[] args) {
		
		int arr[]=new int[100000];
		int arr1[]=new int[100000];
		
		int n;
		int m;
		int k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of values to be include in an array A");
		n=Integer.parseInt(sc.nextLine());
		System.out.println("enter the value of m");
		m=Integer.parseInt(sc.nextLine());
		System.out.println("enter value of k");
		k=Integer.parseInt(sc.nextLine());
		System.out.println("enter the values in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		if(m>0){
			for(int j=m;j<0;j--)
			{
				//int arr2[]=new int[arr+arr1];
				arr1=Arrays.copyOfRange(arr, 0, 2);
				System.out.println(arr1);

			}
		}
		
		
		
		
	}

	
	

}
