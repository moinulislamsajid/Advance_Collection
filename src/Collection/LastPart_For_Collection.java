package Collection;

import java.util.*;

//import ArrayJava.ArrayList;
public class LastPart_For_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Queue is a interface
		// crteate a objects to queue to help the LinkedList
		// this queue is interface that why it can not create an objects
		// this is also FIFO >>-- FIRST IN FIRST OUT 
		Queue<Integer> numbers = new LinkedList<Integer>();
		
		numbers.add(10);
		numbers.offer(29);
		numbers.offer(40);
		numbers.offer(50);
		
		System.out.println("This is Queue : "+numbers);
		numbers.remove();
		System.out.println(numbers);
		// this also use to remove the element
		numbers.poll();
		System.out.println(numbers);
		
		System.out.println(numbers.peek()); // peek for first elememt show
		// this id
		// Deque
		
		// this is also another interface
		
		Deque<Integer> num = new LinkedList<>();
		num.offer(10);
		num.offer(20);
		num.offerLast(40);  // this is the fixed index at last
		num.pollFirst();  //
		num.offerFirst(30);   // this is the fixed index at first
		
		
		System.out.println(num); // [30,10,20,40]
		
		// PriorityQueue
		
		// Always Minimum value get first and other values
		// here the keyword is Comparator as a keyword to find any value
		PriorityQueue<Integer> Roll = new PriorityQueue<Integer>(Comparator.reverseOrder());
		Roll.offer(12);
		Roll.add(3);
		Roll.add(4);
		Roll.offer(2);
		Roll.offer(5);
		
		System.out.println(Roll);
		System.out.println(Roll.peek());  // to find maximum number 
		Roll.poll();
		System.out.println(Roll.peek());  // to find second maximum number


}
}
