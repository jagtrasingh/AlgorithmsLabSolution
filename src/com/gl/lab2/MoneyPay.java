package com.gl.lab2;

import java.util.Scanner;
public class MoneyPay {


	public static void main(String args[]) throws Exception {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");

		int size = scan.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++)

			arr[i] = scan.nextInt();

		System.out.println("Enter the total no of targets that needs to be achieved");
		int iTotTarget = scan.nextInt();
		int iIndex = 0;

		for(iIndex = 0 ; iIndex < iTotTarget ; iIndex++) {

			int iFound = 0;

			long target;

			System.out.println("Enter the value of target");
			target = scan.nextInt();

			long sum = 0;

			for (int i = 0; i < size; i++) { //linear iteration , linear searching

				sum += arr[i];

				if (sum >= target) {

					System.out.println("Target achieved after "+ (i + 1) + " transactions ");

					iFound = 1;

					break;

				}

			}

			if (iFound == 0) {

				System.out.println(" Given target is not achieved ");

			}

		}

	}

}
