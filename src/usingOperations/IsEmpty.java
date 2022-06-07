package usingOperations;

import java.util.LinkedList;

public class IsEmpty {
	public static void main(String[] args) {
		   LinkedList<String>  fruitsList = new LinkedList();
		   System.out.println(fruitsList.isEmpty());//true
			/*
			 * using LinkedList class isEmpty() method, it returns true if the object is
			 * empty, otherwise false.
			 */
		   fruitsList.add("APPLE");
		   System.out.println(fruitsList.isEmpty());//false
	}

}
