package Sorting;

public class Basic_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// buble sorting
		// Asending
		
		int[] number = {7,8,3,1,2};
		
		for(int i =0; i<number.length-1;i++) {
			for(int j =0; j<number.length-1-i;j++) {
				if(number[j] > number[j+1]) {
					// time to need swap
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		
		for(int i =0; i<number.length; i++) {
			System.out.println(number[i] + " ");
		}
		
		// Decending
		
		int[] arr = {34,67,8,23,56};
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("Possible to Decending : "+arr[i]);
		}
		
		// Selection Sort
		
		int[] Roll = {24,45,77,3,54,66,55};
		
		// using the for loop
		for(int i=0; i<Roll.length; i++) {
			int Smallest = i;
			for(int j = i+1; j<Roll.length; j++) {
				if(Roll[Smallest] > Roll[j]) {
					Smallest = j;
				}
			}
			// Now time to swap
			
			int temp = Roll[Smallest];
			Roll[Smallest] = Roll[i];
			Roll[i] = temp;
			
		}
		// Print the Sorting Array 
		
		for(int i =0; i<Roll.length; i++) {
			System.out.println(Roll[i]);
		}
		
		// Insertion sort
		
		int[] numbers = {56,34,2,344,555,66,78,322,455,77};
		
		// Now using Outer Loop
		for(int i =0; i<numbers.length; i++) {
			// TO Find Currtnt Value
			int current = numbers[i];
			// To Show Last Element
			int j = i -1;
			while(j >= 0 && current < numbers[j]) {
				numbers[j+1] = numbers[j];
				j--;
			}
			
			// Now Time to Swap
			
			numbers[j+1] = current;
			
		}
		
		// TO Print the Array 
		
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		}
  
	}


