package com.demo.dsa;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,45,5};
		int temp=0;
		System.out.println("enter element");
		int ele=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("position is"+i);
				temp=temp+1;
				
			}
		}
			if(temp>0)
			{
				System.out.println("found ele");
			}
			else
			{
				System.out.println("not found ele");
			}
		
	
		
		

	}

}
