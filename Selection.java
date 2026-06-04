package com.demo.dsa;
public class Selection {
	public static void main(String[] args) {
		int arr[]= {82,55,2,96,1};
		int temp=0;
		for(int i=0;i<arr.length;i++)		
		{   
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}					
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;

		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		}
	}