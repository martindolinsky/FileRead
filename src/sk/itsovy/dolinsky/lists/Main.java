package sk.itsovy.dolinsky.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Fero");
		list.add("Jozo");
		list.add("Peter");
		list.add("Zidane");
		list.add("Sufuski");
		list.add("Cufurki");
		list.add("Devet");
		list.add("sto plus sto");
		list.add("dva sto");
		list.add("600 korun");
		list.add("105");
		list.add("150");
		list.remove(1);
		System.out.println(list.contains("Fero"));
		System.out.println(list.size());
		list.set(0,"jozo");
		System.out.println(list.get(0));
		System.out.println();
		for (String temp:list) {
			System.out.println(temp);
		}
	}
}
