package com.demo.dsa;

public class Insertion {

	public static void main(String[] args) {
		int arr[]= {6,3,2,9,1};
		int temp,j;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{ arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
