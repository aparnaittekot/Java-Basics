package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionsExamples {

	public static void main(String[] args) {

		int i = 0;
		/**
		 * Vectors and its difference from ArrayList
		 */
		// Vector is synchronized while ArrayList is not
		// Since ArrayList is not synchronized, vectors are slow compared to
		// ArrayLists
		System.out.println("VECTORS");
		Vector<Integer> vector = new Vector<Integer>();
		for (i = 0; i < 10; i++) {
			vector.addElement(i);
		}

		// Vector uses Enumeration interface and even iterator interface
		// ArrayList uses iterator interface
		Enumeration<Integer> e = vector.elements();
		while (e.hasMoreElements()) {
			i = e.nextElement();

			System.out.print(i + "  ");
		}
		System.out.print("\n\n");
		Iterator<Integer> iterator = vector.iterator();
		while (iterator.hasNext()) {
			i = iterator.next();
			if (i == 2) {
				iterator.remove();
			}
		}
		System.out.print(vector);
		System.out.print("\n\n");

		/**
		 * for-each (for accessing items in a collection)
		 */
		System.out.println("FOR-EACH");
		for (Integer element : vector) {
			System.out.print(element + "  ");
		}

		System.out.print("\n\n");
		/**
		 * ListIterator Interface - booleanhasNext(), booleanhasPerivous(),
		 * next(), previous(), remove(), nextIndex(), previousIndex()
		 */
		System.out.println("LIST-ITERATOR INTERFACE");
				
		
	}
}