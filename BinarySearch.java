package com.demo.dsa;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter search element");
		int search = sc.nextInt();

		int arr[] = {1,4,7,9,10};

		int li = 0;
		int hi = arr.length - 1;

		int temp = 0;

		while(li <= hi)
		{
			int mi = (li + hi) / 2;

			if(arr[mi] == search)
			{
				System.out.println("middle index position is ===== " + mi);
				temp = 1;
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

		if(temp == 1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}