package usingOperations;

import java.util.Scanner;

public class Node {
	 int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        next = null;
	    }

	//}
	//public class LinkedList {

	    static Node head;
	    static Scanner scanner = new Scanner(System.in);

	    public static void printData() {

	        Node temp = head;

	        while(temp != null) {
	            System.out.print(temp.data+"->");
	            temp = temp.next;
	        }
	    }
	    //Check if empty
	    public static void checkEmpty()
	    {
	        if(head == null)
	        {
	            System.out.println("List is empty");
	        }
	        else{
	            System.out.println("List is not empty");
	        }
	    }
	    //Adding the node at the last
	    public static void insertAtLast(int data) {
	        Node node = new Node(data);

	        if(head == null) {
	            head = node;
	        }else {
	            Node temp = head;
	            while(temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = node;
	        }
	    }
	    //Adding the node at start
	    public static void insertFirst(int data) {
	        Node node = new Node(data);
	        node.next = head;
	        head = node;

	    }
	    //Adding to a certain position
	    public static void insertAt(int data,int index) {
	        Node node = new Node(data);
	        Node temp = head;
	        if(index == 1)
	        {
	            insertFirst(data);
	        }
	        int count = 2;
	        while(count != index)
	        {
	            temp = temp.next;
	            count++;
	        }
	        node.next = temp.next;
	        temp.next = node;

	    }
	    public static void sizeOfList()
	    {
	        Node temp = head;
	        int size;
	        //To Check if the list is empty
	        if(head == null)
	        {
	            System.out.println("The list is empty");
	            return;
	        }
	        size = 1;

	        while(temp.next != null)
	        {
	            size++;
	            temp = temp.next;
	        }
	        System.out.println("The length of the list is "+size);
	    }
	    //searching
	    public static void search(int data)
	    {
	        Node temp = head;
	        if(head.data == data)
	        {
	            System.out.println("The data "+data+" is on index 1");
	            return;
	        }
	        int count = 1;
	        while(temp.next != null)
	        {
	            if(temp.data == data)
	            {
	                System.out.println("The data "+data+" is on index :"+count);
	                return;
	            }
	            count++;
	            temp = temp.next;
	        }
	    }
	    //Remove at first
	    public static void removeFirst()
	    {
	        head = head.next;
	    }
	    //Remove last
	    public static void removeLast()
	    {
	        Node temp = head;
	        if(head == null)
	        {
	            System.out.println("The list is empty");
	            return;
	        }
	        while (temp.next.next != null)
	        {
	            temp = temp.next;
	        }
	        temp.next = null;

	    }
	    //Remove at any position
	    public static void removeAt(int data) {
	        Node temp = head;
	        if(head == null)
	        {
	            System.out.println("The list is empty");
	        }
	        while(temp.next.data != data)
	        {
	            temp = temp.next;
	        }
	        temp.next = temp.next.next;

	    }
	    //Sorting the list
	    public static void sortData()
	    {
	        if(head == null)
	        {
	            System.out.println("List is empty");
	            return;
	        }
	        int data;
	        Node temp = head,index = null;
	        while(temp != null)
	        {
	            index = temp.next;
	            while (index!= null) {
	                if (temp.data > index.data) {
	                    data = temp.data;
	                    temp.data = index.data;
	                    index.data = data;
	                }
	                index = index.next;
	            }
	            temp = temp.next;
	        }
	    }
	    //update the list
	    public static void update(int data,int updateData) {
	        if(head == null)
	        {
	            System.out.println("The list is empty");
	            return;
	        }
	        Node temp = head;
	        while(temp.data != data)
	        {
	            temp = temp.next;
	        }
	        temp.data = updateData;
	    }
	    public static void main(String[] args) {
	        byte option;
	        int data;
	        int dataToSearch;
	        do {
	            System.out.println();
	            System.out.println("----Linked List----");
	            System.out.println("Enter 1 to insert data at the last data: ");
	            System.out.println("Enter 2 to insert data at the beginning data: ");
	            System.out.println("Enter 3 to find the size of list: ");
	            System.out.println("Enter 4 to find the data in the list: ");
	            System.out.println("Enter 5 to remove the first data from the list: ");
	            System.out.println("Enter 6 to remove the last data from the list: ");
	            System.out.println("Enter 7 to remove the entered data from the list: ");
	            System.out.println("Enter 8 to update the entered data from the list: ");
	            System.out.println("Enter 9 to continue: ");
	            System.out.println("Enter 10 to sort the data :");
	            System.out.println("Enter 0 to exit: ");
	            option = scanner.nextByte();
	            switch (option){
	                case 1 :
	                    System.out.println("Enter the data : ");
	                    data = scanner.nextInt();
	                    //LinkedList.insertAtLast(data);
	                    printData();
	                    break;
	                case 2 :
	                    System.out.println("Enter the data : ");
	                    data = scanner.nextInt();
	                    insertFirst(data);
	                    break;
	                case 3 :
	                    sizeOfList();
	                    break;
	                case 4 :
	                    System.out.println("Enter the data you want to search :");
	                    dataToSearch = scanner.nextInt();
	                    search(dataToSearch);
	                    break;
	                case 5 :
	                    removeFirst();
	                    System.out.println();
	                    printData();
	                    break;
	                case 6 :
	                    removeLast();
	                    System.out.println();
	                    printData();
	                    break;
	                case 7 :
	                    System.out.println("Enter the data you want to delete from the list");
	                    System.out.println();
	                    dataToSearch = scanner.nextInt();
	                    removeAt(dataToSearch);
	                    printData();
	                    break;
	                case 8 :
	                    System.out.println("Enter the data you want to update from the list");
	                    System.out.println();
	                    dataToSearch = scanner.nextInt();
	                    System.out.println("Enter the data you want it to be updated to :");
	                    int updateData = scanner.nextInt();
	                    update(dataToSearch,updateData);
	                    printData();
	                    break;
	                case 10:
	                    printData();
	                    System.out.println();
	                    sortData();
	                    System.out.println();
	                    printData();
	                    break;
	                case 0:
	                    System.out.println("Thank You!!");
	                    break;
	            }
	        }while(option != 0);




	    }
}
