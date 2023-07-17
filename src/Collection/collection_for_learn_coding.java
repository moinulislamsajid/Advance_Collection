package Collection;
import java.util.*;


public class collection_for_learn_coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an array list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ayman");
		names.add("Sajid");
		names.add("AltafKaka");
		Collections.binarySearch(names, "Sajid");
		System.out.println("Max : "+Collections.max(names));
		//System.out.println(names);

		System.out.println(names);
		
		names.add("Samiur Rahman Sakib");
		System.out.println(names);
		
		names.add(1,"Mojibur Rahman");
		System.out.println(names);
		
		// to remove
		names.remove(0);
		System.out.println(names);
		
		// to replace
		
		names.set(1,"Ayman Sajid");
		System.out.println(names);
		
		// to print one array
		System.out.println(names.get(0));
		
		// to clear 
		//names.clear();
		
		// now new create another predefined LinkedList list 
		
		LinkedList<String> village = new LinkedList<String>();
		village.add("Domrakandi");
		////System.out.println(village);
		
		village.add(1, "ayman sajid");
		//System.out.println(village);
		
		village.addFirst("Mojibur Rahman");
		village.addLast("Samiur Rahman Sakib");
		village.add(2, "Rebeka Sultana Pakhi");
		//System.out.println(village);
		
		//village.remove();
		//System.out.println(village);
		
		//village.remove(0);
		//System.out.println(village);
		
		//village.removeLast();
		//System.out.println(village);
		
		// using for each loop
		
		// syntax for each loop
		// for(Data type new variable : old variable)
		
		for(String hey : village) {
			System.out.println(hey);
		}
		
		
		// create another predefined list this is Stack
		// it is work last in first out LIFO
		
		Stack<String>university = new Stack<>();  // stack can one data type is ok it can not second time declaring data type;
		university.push("Dhaka International University");
		university.push("Brac University");
		university.push("North South University");
		for(String versity : university) {
			System.out.println(versity);
		}
		university.pop();
		System.out.println(university);  // here is the example of last in first out that it


		// Another predefined list this is ArrayDeque
		// this is first in first out FIFO
		
		ArrayDeque<String> university1 = new ArrayDeque<>();
		
		university1.push("Brac University");
		university1.push("Dhaka International University");
		university1.push("North South University");
		System.out.println(university1);
		
		university1.pop();
		System.out.println(university1);
		
	


	}

}
