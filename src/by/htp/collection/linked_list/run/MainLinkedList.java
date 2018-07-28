package by.htp.collection.linked_list.run;

import by.htp.collection.linked_list.logic.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList my = new LinkedList();
		my.addFirst("Kolya", 25);
		my.addFirst("Vasya", 23);
		my.addFirst("Kate", 18);
		my.addLast("Marina", 22);
		my.addLast("Olga", 14);
		my.addFirst("Ksylik", 26);
		my.show();
		System.out.println(my.getLength());
		my.deleteFirst();
		my.show();
		System.out.println(my.getLength());
		my.addIndex("JON", 33, 3);
		my.show();
		System.out.println(my.getLength());
	}

}
