package com.microAndarray;

import java.util.Arrays;
import java.util.Scanner;

public class MicroArray {
	public static void main(String args[] ) throws Exception {
		Scanner sc= new Scanner(System.in);
		int i,test;
		int K,N,result,temp=0;
    	System.out.println("enter value of test");

		test=sc.nextInt();
		    while(test!=0){
		    	System.out.println("enter value of N");
		        N=sc.nextInt();
		    	System.out.println("enter value of K");

		         K=sc.nextInt();
		 
		        int a[]=new int[N];
		    	System.out.println("enter array values");

		    	for(i=0;i<N;i++){
		    		a[i]=sc.nextInt();
		    	}
		    Arrays.sort(a);
		 
		if(K<=a[0]){
		    System.out.println("0\n");
		    }else{
		    result=K-a[0];
		   
		    System.out.println(result);
		    }
		 
		    test--;
		    }
		 
		 
		 }
		}



