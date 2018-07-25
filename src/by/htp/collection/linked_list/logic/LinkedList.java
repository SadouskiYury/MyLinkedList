package by.htp.collection.linked_list.logic;

import by.htp.collection.linked_list.entity.Node;

public class LinkedList {
	private Node last;
	private Node first;
	private Node current;
	private int length;

	public LinkedList() {
		this.first = null;
		this.last = this.first;
		this.length = 0;
	}

	public void addFirst(String name, int age) {
		Node node = new Node(name, age);
		if (isEmprty()) {
			last = node;
			first = node;
		} else {
			node.next = first;
			first.prev = node;
			first = node;
		}
		++this.length;
	}

	@Override
	public String toString() {
		return "LinkedList [" + first + last;
	}

	public void addLast(String name, int age) {
		Node node = new Node(name, age);
		if (isEmprty()) {
			first = node;
			last = node;
			node.next = null;
			node.prev = null;
		} else {
			last.next = node;
			node.prev = last;
			last = node;

		}
		++this.length;
	}

	public void addMiddle(String name, int age) {
		Node node = new Node(name, age);
		if (isEmprty()) {
			first = node;
		} else {
			current = first;
			for (int i = 1; i < this.length; i++) {
				if (i == this.length / 2) {
					node.next = current;
					node.prev = current.prev;
					current.prev = node;

					break;
				}
				current = current.next;
			}

		}
		++this.length;
	}

	public void addIndex(String name, int age, int k) {
		Node node = new Node(name, age);
		if (isEmprty()) {
			first = node;
		} else {
			current = first;
			for (int i = 1; i < this.length; i++) {
				if (i == k - 1) {
					node.prev = current;
					node.next = current.next;
					current.next = node;
					break;
				}
				current = current.next;
			}

		}
		++this.length;
	}

	public void deleteFirst() {
		if (isEmprty()) {
			System.out.println("Your list is emprty");
		} else {
			Node tmp = first.next;
			tmp.prev = first;
			first = tmp;

		}
		--this.length;
	}

	public boolean isEmprty() {
		return (first == null);
	}

	public void show() {
		Node iterator = first;
		while (iterator != null) {
			iterator.show();
			iterator = iterator.next;
		}
		System.out.println("!!!");
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
