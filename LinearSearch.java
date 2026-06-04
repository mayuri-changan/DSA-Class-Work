package com.demo.dsa;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	
Scanner sc=new Scanner (System.in);
int arr[]= {14,2,8,1};
System.out.println("enter elemenet");
int ele=sc.nextInt();
int temp=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==ele)
	{
		System.out.println("indesx position is :"+i);
		temp=temp+1;
	}
	
}
if(temp>0)
{
	System.out.println("found element");
}
else
{

	System.out.println("not found element");
}
	}

}
