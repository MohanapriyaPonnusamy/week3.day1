package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "madam";
       String rev = "";
       int length = input.length();
       for(int i = length-1; i>=0;i--) {
    	   rev = rev+input.charAt(i);
    	     }
       if(input.equalsIgnoreCase(rev)) {
    	   System.out.println("Given string is a palindrome");
       }
       else {
    	   System.out.println("Given string is not a palindrome");
       }
	}

}
