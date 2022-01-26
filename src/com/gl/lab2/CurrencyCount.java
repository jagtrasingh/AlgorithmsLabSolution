package com.gl.lab2;

import java.util.Arrays;
import java.util.Scanner;

import com.gl.lab2.MergeSortImplementation;
import com.gl.lab2.Count;

public class CurrencyCount {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		Count notesCount = new Count();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.totalCount(notes, amount);
	}
}