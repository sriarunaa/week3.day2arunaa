package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] C = test.toCharArray();
		for(int i = 0; i < C.length; i++)
		{
			if(i%2!=0)
			{
				char c1=Character.toUpperCase(C[i]);
			System.out.println(c1);
			
		}
			else
			{
				System.out.println(C[i]);
			}
		}
	}
}
			
		
	

	


