package com.demo.dsa;

import java.util.Scanner;

public class DsaModuleEnd{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Array input
		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter array elements:");

		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}

		// Selection Sort
		for(int i = 0; i < arr.length - 1; i++)
		{
			int min = i;

			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}

			// Swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		// Print sorted array
		System.out.println("Sorted Array:");

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

		// Binary Search
		System.out.println("\nEnter search element:");
		int search = sc.nextInt();

		int li = 0;
		int hi = arr.length - 1;

		int found = 0;

		while(li <= hi)
		{
			int mi = (li + hi) / 2;

			if(arr[mi] == search)
			{
				System.out.println("Element found at index: " + mi);
				found = 1;
				break;
			}
			else if(arr[mi] < search)
			{
				li = mi + 1;
			}
			else
			{
				hi = mi - 1;
			}
		}

		if(found == 0)
		{
			System.out.println("Element not found");
		}
	}
}