package JAVA_Programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator_demo {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		ListIterator<Integer> itr = ar.listIterator();
		while (itr.hasNext()) {
			Object ob = itr.next();
			System.out.print(ob+" ");
		}
		System.out.println();

		while (itr.hasPrevious()) {
			Object ob = itr.previous();
			System.out.print(ob+" ");
		}

	}

}
