package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
String S="madam";
String rev="";
for(int i=S.length()-1;i>=0;i--) {
    rev = rev+S.charAt(i);
}
if(S.equalsIgnoreCase(rev))
{
	System.out.println("The String is palindrome");
	
}
else
{
	System.out.println("The string is not a palindrome");
}
	}

}
