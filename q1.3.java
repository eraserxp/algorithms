/**
* Given two strings, write a method to decide if one is a permutation
* of the other
*/

public class PermutationTest {
	
	public static void main(String[] args) {
		
	}
	
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length != s2.length) return false;
		
		//assuming it is ascii characters
		// there are 256 characters in total
		int [] char_occurence = new int[256];
		// will initialize all elements to zero?
		
		char [] s1_array = s1.toCharArray();
		
		for (char c: s1_array) {
			// you can use a char as if it is an integer
			char_occurence[c]++;
		}
		
		for (int i=0; i<s2.length; i++) {
			char c = s2.charAt(i);
			if ( char_occurence[c]==0 ) {
				return false;
			}
			char_occurence[c]--;
		}		
		return true;
	}	
}		

