package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("3");
		list.add("2");
		list.add("11");
		list.add("4");
		list.add("7");
		list.add("6");
		Collections.sort(list);
		System.out.println(list.get(58) + "is the Second largest Number");

	}

}
