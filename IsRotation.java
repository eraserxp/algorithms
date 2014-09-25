/*
 * Assume you have a method isSubstring which checks if one word is a
 * substring of another. Given two strings, s1 and s2, write code to 
 * check if s2 is a rotation of s1 using only one call to isSubstring
 * (e.g., "waterbottle" is a rotation of "erbottlewat").
 */
 
public class IsRotation {
	
	// find the first occurence of a char c from string s starting
	// from position pos
	public static int findCharOnward(char c, String s, int pos) {
		while (s.charAt(pos) != c) {
			++pos;
		}
		return pos;										   
	}
											   
	// check if s1 is a substring of s2
	public static boolean isSubstring(String s1, String s2) {
		if (s1.length() > s2.length() ) return false;
		
		int s1_cur = 0;
		int s2_cur = 0;
		
	}
		
	public static void main(String[] args) {
		
	}	
}	  
