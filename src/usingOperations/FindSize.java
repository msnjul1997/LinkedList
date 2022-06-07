package usingOperations;

import java.util.LinkedList;

public class FindSize {
	 public static void main(String args[])
	    {
	  
	       
	        LinkedList<String> list = new LinkedList<String>();
	  
	        // Using add() method to add elements in the list
	        list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	        list.add("10");
	        list.add("20");
	  
	        // Displaying the linkedlist
	        System.out.println("LinkedList:" + list);
	          
	        // Displaying the size of the list
	        System.out.println("The size of the linked list is: " 
	                                                + list.size());
	    }
	}


