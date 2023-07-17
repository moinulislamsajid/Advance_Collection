package Collection;
import java.util.*;
public class All_About_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// map used to retain group of value 
		// Map is a interface it can not create any objects 
		// Map works on Key and value 
		
		Map<Integer,String> info = new HashMap<>();
		info.put(101, "Ayman Sajid");
		info.put(102, "Samiur Rahman Sakib");
		info.put(103, "Mojibur Rahman");
		info.put(104,"Afran Nisho");
		
		System.out.println(info.get(101));
		//System.out.println(info.get(102));
		System.out.println(info.get(103));
		System.out.println(info.get(104));
		
		info.replace(102,"Sakib");
		System.out.println(info.get(102));
		
		System.out.println(info);
		
		// create a hashmap
		HashMap<Integer,Integer> details = new HashMap<>();
		details.put(1, 101);
		details.put(2, 102);
		details.put(3, 103);
		details.put(4, 104);
		
		details.remove(1);
		
		System.out.println("Here is the HashMap Keys : "+details.keySet());
		System.out.println("Here is the HashMap Values : "+details.values());
		
		
		
		
		// Tree map are sorted 
		
		TreeMap<String,Integer> info1 = new TreeMap<String,Integer>();
		info1.put("Zian", 100);
		info1.put("Sakib", 10);
		info1.put("Ayman", 55);

		System.out.println("TreeMap ka result : "+info1);  // Acatully works on going on to String character
		System.out.println(info1.keySet());
		System.out.println(info1.values());
		// Anothet TreeSet are created 
		// Tree set to print all the value any kind of data type integer or String to print the Sequence the print
		TreeMap<Integer,Integer> regNumber = new TreeMap<>();
			regNumber.put(6, 101);
			regNumber.put(3, 104);
			regNumber.put(1, 575);
			regNumber.put(4, 34);
			
			System.out.println("The value of TreeMap : "+regNumber);
			
			// here Arrays as a keyword to find the any kind of things such as Soring or maximum value
		// Arrays for sorting
		int[] num = {39,23,45,6,7,8,90,27};
		// for each loop
		for(int e : num) 
			System.out.println(" "+e);
			Arrays.sort(num);
			System.out.println();
			for(int e : num)
				System.out.println(" "+e);
			
		System.out.println(Arrays.binarySearch(num, 6));  // to show the location
			

	}

}
