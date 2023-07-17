package Collection;

import java.util.*;
public class collection_Codding_Wallah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a list
		// when you create only list you can add any type of data such as float double and String alos integer and character
		// Because List is a interface . But interface cannot create any objects 
		List list = new ArrayList();
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		
		list.add(2, 35);
		System.out.println(list);
		
		list.add("Ayman Sajid");
		System.out.println(list);
		
		
		// now create a genric 
		
		// Collections as a keyword to find any value maximum or sotring
		
	
		 
		ArrayList<Integer> lol = new ArrayList<Integer>();  // here integer is  a genric
		
		lol.add(40);
		lol.add(10);
		lol.add(60);
		
		System.out.println(lol);
		Collections.sort(lol);
		System.out.println("After sorting : "+lol);
		System.out.println("Max Value : "+Collections.max(lol));
		Iterator it = lol.iterator();
		while(it.hasNext()) {
			System.out.println("List Value : "+it.next());
		}

		
		// but when you add any string to this genric integer specific data type 
		
		
		// ArrayList
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Ayman");
		names.add("Sajid");
		
		System.out.println(names);
		//names.remove();
		//System.out.println(names);
		
		names.remove(1);
		System.out.println(names);
		
		
		// Vector
		Vector<String> Uni_name = new Vector<String>();
		Uni_name.add("Ayman Sajid");
		Uni_name.add("Samiur Rahman Sakib");
		
		
		System.out.println("Vector is : "+Uni_name);
		Uni_name.remove(0);
		System.out.println("After remove : "+Uni_name);
				
		Uni_name.clear();
		
		System.out.println(Uni_name);
		
		// Stack 
		// LIFO
		Stack<Integer> num = new Stack<>();
		
		// this add also use on stack to any value push
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
		System.out.println("Stack : "+num);
		System.out.println("Stack : "+num.peek());

		// when use to stack than any element remove than use to pop
		
		num.pop();
		System.out.println("Stack : "+num);

		// ArrayDeque
		
		//ArrayDeque<> similur to Stack
		
		// Declaring a Set or create a set
		
		Set<Integer> number = new HashSet<Integer>();
		number.add(40);
		number.add(50);
		number.add(60);
		number.add(40);  // set same value can ignore also unorder
		
		System.out.println("Set : "+number);
		
		// LinkedHashSet
		
		// this set ignore same value but print order list
		
		LinkedHashSet<Integer> Roll = new LinkedHashSet<Integer>();
		Roll.add(10);
		Roll.add(20);
		Roll.add(30);
		Roll.add(40);
		Roll.add(50);
		
		System.out.println("This is LinkedHashSet : "+Roll);
		
		// treeSet 
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		
		System.out.println(numbers);
		
		numbers.pollFirst();
		System.out.println(numbers);
		
		numbers.pollLast();
		System.out.println(numbers);
		
		numbers.remove(20);
		System.out.println(numbers);
	
	
		
	}
}
		





	