package Recursion;

public class Recursion_Level_1 {
	// create a function 
	public static void printNumber(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printNumber(n-1);
	}
	// For Asending order
	
	public static void AsendingNumber(int m) {
		
		if(m == 6) {
			return;
		}
		
		System.out.println(m);
		AsendingNumber(m+1);
	}
	// to find the sum
	public static void FindSum(int i , int n , int sum) {
		if(i==n) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		FindSum(i+1,n,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =5;
		printNumber(n);
		
		int m =1        ;
		AsendingNumber(m);
		// here call the find the sum 
		FindSum(1,5,0); // started at 1 and less then 5 and initialization value sum is 0

	}

}
