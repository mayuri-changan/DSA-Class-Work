package com.demo.dsa;

import java.util.Scanner;

public class Ll {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		System.out.println("enter elee");
		int key = sc.nextInt();
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{   
				temp=1;
				System.out.println(i);
				break;
				
				
			}
			
		}
			if(temp==1)
			{System.out.println("found");
				
			}
			else
			{
			System.out.println("not found");
			}
			sc.close();
			
		
		}

	}


