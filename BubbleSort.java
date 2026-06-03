package com.demo.dsa;
public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {5,3,2,9,1};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("bubble sort is:==========="+arr[i]);
		}
		

	}

}
