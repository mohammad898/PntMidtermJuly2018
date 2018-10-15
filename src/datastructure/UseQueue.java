package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queuetest = new LinkedList<String>();
		queuetest.add("Mohammad");
		queuetest.add("Haque");
		queuetest.add("Jewell");
		queuetest.add("Abdul");
		System.out.println("First element : "+queuetest.peek());
		queuetest.remove();
		System.out.println("After removing head: "+queuetest.peek());
		queuetest.add("Seddek");
		queuetest.add("Ahmad");
		System.out.println("Printing queue using for each loop: ");
		for(String st : queuetest) System.out.print(st+" ");
		
		queuetest.poll();

		System.out.println("Printing queue  using Iterator ");

		Iterator iterator = queuetest.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator+" ");
		}

	}

}
