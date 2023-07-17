package Sorting;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Asending to print array number or elememt
		
		// declaring and initialization the array
		int[] num = {43,23,111,3,566,1,88,42,0};
		
		// now using loop
		
		for(int i =0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1-i;j++) {
				if(num[j] > num[j+1]) {
					// now time to swap
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		// Now printng the Array
		System.out.println("Now Time to Enrooll Asending : ");
		
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i] + " ");
		}
		
		// Now time to convert Desinding
		
		// Again Declaring and Initialization the array
		
		int[] number = {1,45,23,78,23,111,56,222,44,67,0,66};
		
		// uning for loop
		
		for(int i =0; i<number.length; i++) {
			for(int j=i+1; j<number.length; j++) {
				if(number[i] < number[j]) {
					// Time to Swap
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		// To Print the value
		System.out.println("Now Time to Check Decending : ");
		for(int i =0; i<number.length; i++) {
			System.out.println(number[i]);
		}

	}

}
