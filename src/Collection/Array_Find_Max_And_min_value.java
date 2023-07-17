package Collection;

import java.util.Scanner;

public class Array_Find_Max_And_min_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("How Many Size : ");
		num = input.nextInt();
		double[] number = new double[10];
		for(int i=0;i<=num;i++) {
			number[i] = input.nextDouble();
		}
		double sum=0;
		double avg=0;
		for(int i=0;i<=number[i];i++) {
			sum = sum + number[i];
			avg = sum/number[i];
		}
		System.out.println("The Sum of Arrays : "+sum);
		System.out.println("The average Arrays : "+avg);
		
		
		// maximum number
		double max = number[0];
		for(int i =0 ; i<=number[i]; i++) {
			if(number[i]>max) {
				max = number[i];
			}
		}
		System.out.println("Maximum Number is : "+max);

		// minimum number
		
		double min = number[0];
		for(int i=0;i<=number[i];i++) {
			if(number[i]<min) {
				min = number[i];
			}
		}
		System.out.println("Manimum Number is : "+min);


	}

	}


