package list.linkedlist;

import static java.lang.System.out;

import list.linkedlist.LinkedList.Iterator;
//import list.linkedlist.LinkedList.ListIterator;

public class Main {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(0, 4);
		li.add(1, 1);
		li.add(2, 15);
		li.addLast(5);
		li.add(3, 6);
		out.println(li.get(0));
		out.println(li.get(1));
		out.println(li.get(2));

		out.println(li.toString());

		/*
		 * ListIterator iter = li.listIterator();
		 * 
		 * while(iter.hasNext()) { System.out.println(iter.next()); }
		 */

		Iterator iter = li.dataIterator();
		while (iter.hasNext()) {
			int i = (int) iter.next();
			System.out.println(i);
			if ((int) i == 6) {
				iter.remove();
			}
		}

		System.out.println(li.toString());
	}
}
