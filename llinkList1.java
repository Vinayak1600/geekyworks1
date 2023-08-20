package vkpatil;
import java.util.Scanner;
public class llinkList1 {
	Scanner sc = new Scanner(System.in);

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	class LinkedList {
		Node head;

		    public LinkedList() {
		        this.head = null;
		    }
		    
		    public void insertAtBeginning(int data) {
		        Node newNode = new Node(data);
		        newNode.next = head;
		        head = newNode;
		    }

		    public void insertAtEnd(int data) {
		        Node newNode = new Node(data);
		        
		        if (head == null) {
		            head = newNode;
		            return;
		        }
		        
		        Node current = head;
		        while (current.next != null) {
		            current = current.next;
		        }
		        
		        current.next = newNode;
		    }

		public void display() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
		
		 public void deleteFromBeginning() {
		        if (head == null) {
		            System.out.println("List is empty. Nothing to delete.");
		            return;
		        }
		        
		        head = head.next;
		    }

		 public void deleteFromEnd() {
		        if (head == null) {
		            System.out.println("List is empty. Nothing to delete.");
		            return;
		        }
		        
		        if (head.next == null) {
		            // Only one node in the list
		            head = null;
		            return;
		        }
		        
		        Node secondLast = head;
		        while (secondLast.next.next != null) {
		            secondLast = secondLast.next;
		        }
		        
		        secondLast.next = null;
		 }
		
	}
	public void singlyLLOperation() {
		LinkedList ll = new LinkedList();
		do {
			System.out.println("1.insert at beginning");
			System.out.println("2.insert at end");
			System.out.println("3.delete from beginning");
			System.out.println("4.delete from end");
			System.out.println("5.display");
			System.out.println("6.exit");
			
			int ch;
			System.out.println("enter your choice");
			ch = sc.nextInt();
			int value;
			switch (ch) {
			case 1:
				System.out.println("enter the value");
				value = sc.nextInt();
				ll.insertAtBeginning(value);
				break;

			case 2:
				System.out.println("enter the value");
				value = sc.nextInt();
				ll.insertAtEnd(value);
				break;
			case 3:
				ll.deleteFromBeginning();
				break;
			
			case 4:
				ll.deleteFromEnd();
				break;
			case 5:
				ll.display();
				break;
			case 6:
				dataStructure.main(null);
				System.exit(1);
				break;
			default:
				System.out.println("wrong choice");

			}

		} while (true);

	}
	
}

