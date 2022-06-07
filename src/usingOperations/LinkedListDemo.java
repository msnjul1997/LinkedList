package usingOperations;

import java.util.Scanner;

public class LinkedListDemo {
	static Node firstNode;
	static Scanner scanner = new Scanner(System.in);
	
	public static void printData() {
		
		Node temp = firstNode;
		
		while(temp != null) {
			System.out.print("["+temp.data + " | nextNodeRef =" + temp.nextNodeOfRef+ "] -> ");
			temp = temp.nextNodeOfRef;
		}
	}
	
	public static void add(int data) {
		Node newNode = new Node(data);
		
		if(firstNode == null) {
			firstNode = newNode;
		}else {
			Node temp = firstNode;
			while(temp.nextNodeOfRef != null) {
				temp = temp.nextNodeOfRef;
			}
			temp.nextNodeOfRef = newNode;
		}
	}

	public static void main(String[] args) {
//		Node node1 = new Node(12);
//		Node node2 = new Node(16);
//		Node node3 = new Node(30);
//		Node node4 = new Node(50);
//		
//		Node node5 = new Node(100);
//		
//		node1.nextNodeOfRef = node2;
//		node2.nextNodeOfRef = node3;
//		node3.nextNodeOfRef = node4;
//		node4.nextNodeOfRef = node5;
		byte x = 1;
		do {
			System.out.println("Enter data ->");
			int data = scanner.nextInt();
			add(data);
			printData();
			System.out.println();
			System.out.println("do you want to add one more note in linkedlist.... press 1");
			//x = Scanner.nextByte();
		}while(x == 1);
		
		printData();
	}
}

//normal list using int type
//add
//printlist
//addNodeAtLast
//addNodeAtFirst
//addNodeAtPosition => 
//search
//removeNodeAtFirst
//removeNodeAtLast
//removeNodeAtAnyPosition
//updateNodeAtAnyPosition
//findSize
//isEmpty
//normal list using generic

