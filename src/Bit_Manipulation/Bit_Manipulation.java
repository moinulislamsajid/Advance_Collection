package Bit_Manipulation;

public class Bit_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to get bit 
		
		int n = 5;
		int pos = 2;
		int bitmask = 1<<pos;
		
		if((bitmask & n) == 0) {
				System.out.println("Bit was zero");
		}else
		{
			System.out.println("Bit was one");
		}
		// to set bit
		int n1 = 5 ;
		int pos1 = 1;
		int bitmask2 = 1<<pos1;
		int newNumber = bitmask2 | n1;
		System.out.println(newNumber);
		
		// to clear bit
		
		int m = 5;
		int position = 2;
		int bit_M = 1<<position;
		int notBitmask = ~(bit_M);
		int newN = notBitmask & m;
		System.out.println(newN);
		
		// Update Bit
		
		int t = 5;
		int posi = 1;
		int oper = 1;
		
		// set operation
		
		int bitmusk = 1<<posi;
			

	}

}
