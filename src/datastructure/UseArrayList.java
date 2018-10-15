package datastructure;
import databases.ConnectToMongoDB;

import java.io.*;
import java.sql.*;
import java.util.*;

public class UseArrayList {


	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
	 List<Integer> list = new ArrayList<Integer>();
	 list.add(50);
	 list.add(88);
	 list.add(77);
	 list.add(66);
	 list.add(55);
	 list.add(81);
	 list.add(73);
	 list.add(68);
		System.out.println("  Arraylist Elements :");
	 for(Integer arry: list) System.out.print(arry+" ");
	 
      list.remove(3);
      list.add(82);
 	 list.add(72);
 	 
		System.out.println( "After removeing element:");
		for(Integer arry: list) System.out.print(arry+" ");
		System.out.println("  array list size: " + list.get(list.size()-1));

		ConnectToMongoDB conn = new ConnectToMongoDB();
		List<Integer> list1 = conn.insertArrayList(list);
		System.out.println(" Displayed data: ");
		for(Integer a:list1){
			System.out.print(a+" ");
		}


	}


	}


