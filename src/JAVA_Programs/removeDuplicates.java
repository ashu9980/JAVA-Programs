package JAVA_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {

		ArrayList<Integer> newlist = new ArrayList<Integer>();
		for (Integer ele : list) {
			if (!newlist.contains(ele)) {
				newlist.add(ele);
			}
		}
		return newlist;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		System.out.println("Before removing duplicates: " + list);
		ArrayList<Integer> newlist = removeDuplicates(list);
		System.out.println("Before removing duplicates: " + newlist);

	}

}
