package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length() == text2.length()) {
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2)) {
				System.out.println("The given strings are anagram");
			}
			else {
				System.out.println("The given string is not anagram");
			}
		}

	}

}
