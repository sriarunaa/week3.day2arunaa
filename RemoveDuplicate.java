package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
			String name="We learn java basics as part of java sessions in java week1";
			char[] charArray = name.toCharArray();
			Set<Character> input=new LinkedHashSet<Character>();
			for (int i = 0; i < charArray.length; i++) {
				input.add(charArray[i]);
			}
			    //datatype var:set name
			for (Character var : input) {
				System.out.println(var);
				
			}
			
			
			
			
			
	      System.out.println(input);
		}

	

	}


