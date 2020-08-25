package binarySearching;

import java.util.Scanner;

public class Executor {

	public static int array[];
	public static int result;
	
	public static void main(String[] args) {

		System.out.println("Enter the size of array:");

		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();

		array = new int[arraySize];

		System.out.println("Enter the numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		System.out.println("Enter the number to find: ");
		int key = scan.nextInt();
		
		result = BinarySearch.search(array,key);

		if(result==-1) {
			System.out.println("Number not found!");
		}
		else
		System.out.println("Your number is at the position: " + (result+1));

		scan.close();

	}

}
