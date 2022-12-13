package com.training.collection;

class Node<T> {

	T data;
	Node next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node head = null;

	public void insertAtBeging(int a) {
		Node n1 = new Node(a);
		if (head == null) {
			head = n1;
		} else {
			n1.next = head;
			head = n1;
		}
	}

	void display() {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + "==>");
			start = start.next;
		}
	}
}

public class LinkedListMaster {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertAtBeging(10);
		l.insertAtBeging(20);
		l.insertAtBeging(30);
		l.insertAtBeging(40);

//		    l.insertAtEnd(10);
//		    l.insertAtEnd(20);
//		    l.insertAtEnd(40);
//		    l.insertAtEnd(50);

		l.display();
	}
}
